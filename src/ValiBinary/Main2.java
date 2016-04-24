package ValiBinary;

import java.util.Currency;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import ValiBinary.Main.TreeNode;

public class Main2 {
	public static TreeNode cur = null;
	public static TreeNode pre = null;
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode node = new Main2().new TreeNode(5);
		TreeNode node1 = new Main2().new TreeNode(2);
		TreeNode node2 = new Main2().new TreeNode(7);
		TreeNode node3 = new Main2().new TreeNode(6);
		TreeNode node4 = new Main2().new TreeNode(8);
		node2.left = node3;
		node2.right = node4;
		node.left = node1;
		node.right = node2;
		// printK(a,5);
		/*
		 * int left = 0; int right = 10000;
		 */
		
		System.out.print(isValidBST(node));
	}

public static boolean isValidBST(TreeNode root) {
	 if(root == null){
		 return true;
	 }
	 boolean a = isValidBST(root.left);
	 pre = cur;
	 cur = root;
	 
	 if(pre!=null&&pre.val>=cur.val){//要考率到与子节点相同的情况
		 return false;
	 }
	 boolean b = isValidBST(root.right);
	 return a&&b;
   }
}
