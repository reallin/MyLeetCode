package MergeTwoList;
/**
 * Merge two sorted linked lists and return it as a new list. The new list should be 
 * made by splicing together the nodes of the first two lists.

Subscribe to see which companies asked this question
 * @author linxj
 *
 */
public class Merge {
	public static void main(String[] args){
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node1.next = node3;
		node2.next = node4;
		ListNode result = merge(node1, node2);
		while (result!=null) {
			System.out.print(result.val);
			result = result.next;
		}
	}
	public static ListNode merge(ListNode head1,ListNode head2){
		if(head1 == null&& head2 == null){
			return null;
		}
		if(head1 == null){
			return head2;
		}
		if(head2 == null){
			return head1 ;
		}
		ListNode head = null;
		if(head1.val <head2.val){
			head = head1;
			head1 = head1.next;
		}else{
			head = head2;
			head2 = head2.next;
		}
		//ListNode head = head1.val < head2.val?head1:head2;
		ListNode result = head;
		//head1 = head1.next;
		while(head1!=null && head2 !=null){
			if(head1.val < head2.val){
				head.next = head1;
				head1 = head1.next;
				head = head.next;
			}else{
				head.next = head2;
				head2 = head2.next;
				head = head.next;
			}
		}
		if(head1 != null){
			head.next = head1;
			
		}
		if(head2 != null){
			head.next = head2;
			
		}
		return result;
	}
}
