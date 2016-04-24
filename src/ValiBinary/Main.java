package ValiBinary;
/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * @author linxj
 *思路：（1）用递归，设置左屏障和右屏障，从上往下判断。
 *（2）方法二，用中序遍历，发现不是有序的就输出false。
 */
public class Main {
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
	public static void main(String[] args){
	TreeNode node =  new Main().new TreeNode(5);
	TreeNode node1 =  new Main().new TreeNode(2);
	TreeNode node2 =  new Main().new TreeNode(7);
	TreeNode node3 =  new Main().new TreeNode(4);
	TreeNode node4 =  new Main().new TreeNode(8);
	node2.left = node3;
	node2.right = node4;
	node.left = node1;
	node.right = node2;
		//printK(a,5);
	/*int left = 0;
	int right = 10000;*/
	System.out.print(isValidBST(node));
	}
	 public static boolean isValidBST(TreeNode root) {
		 int left = Integer.MIN_VALUE;
			int right = Integer.MAX_VALUE;
	        if(root == null){
	        	return true;
	        }
	        if(root.left == null&&root.right==null){
	        	return true;
	        }
	        return validBinary(root, left, right);
	    }
	
	public static boolean validBinary(TreeNode head,int left,int right){
		if(head == null){
			return true;
		}
		if(head.val<=left)
		{
			return false;
		}
		if(head.val>=right)
		{
			return false;
		}
			
			return validBinary(head.left,left,head.val)&&validBinary(head.right,head.val,right);
	}
}
