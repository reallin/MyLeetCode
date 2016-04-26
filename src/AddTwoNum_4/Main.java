package AddTwoNum_4;
/**
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 * @author linxj
 *计算两个链表对应位的和，如2+5=7。
 */
public class Main {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	          if (l1 == null) return l2;  
	        if (l2 == null) return l1;  
	          
	        ListNode ret = l1;  
	        ListNode pre1 = new ListNode(0);  
	        pre1.next = l1;  
	          
	        int flag = 0;  
	        while (l1 != null && l2 != null) {  
	            l1.val = l1.val + l2.val + flag;  
	            flag = l1.val / 10;  
	            l1.val = l1.val % 10;  
	            pre1 = l1;  
	            l1 = l1.next;  
	            l2 = l2.next;  
	        }  
	  
	        if (l2 != null) {  
	            pre1.next = l2;  
	            l1 = l2;  
	        }  
	          
	        while (l1 != null) {  
	            l1.val += flag;  
	            flag = l1.val / 10;  
	            l1.val = l1.val % 10;  
	            pre1 = l1;  
	            l1 = l1.next;  
	        }  
	          
	        if (flag > 0) {  
	            ListNode node = new ListNode(1);  
	            pre1.next = node;  
	        }  
	          
	        return ret;
	    }
	
}
