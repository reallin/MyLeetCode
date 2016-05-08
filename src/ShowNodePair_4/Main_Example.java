package ShowNodePair_4;

import java.awt.Label;

import ShowNodePair_4.Main.ListNode;
/**
 * 使用递归，方法很巧妙
 * 
 * @author linxj
 *
 */
public class Main_Example {
	public static void main(String[] args){
		Main main = new Main();
		ListNode node1 = main.new ListNode(1);
		ListNode node2 = main.new ListNode(2);
		ListNode node3 = main.new ListNode(3);
		ListNode node4 = main.new ListNode(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode head = swapPairs(node1);
		while(head!=null){
			System.out.println(" "+head.val);
			head = head.next;
		}
	}
	public static ListNode swapPairs(ListNode head) {
    	if(head==null||head.next==null){
    		return head;
    	}
    	ListNode listNode =head.next;
    	head.next = swapPairs(head.next.next);
    	listNode.next = head;
    	return listNode;
    }
}
