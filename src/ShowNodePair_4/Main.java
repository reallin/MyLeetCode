package ShowNodePair_4;

import java.util.ArrayList;

import MergeListNode_4.Main.ListNode;
/**
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
 * @author linxj
 *
 */
public class Main {
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
	 public class ListNode {
		      int val;
		      ListNode next;
		     ListNode(int x) { val = x; }
		  }
	    public static ListNode swapPairs(ListNode head) {
		        if(head == null){
		        	return null;
		        }
		        ListNode cur = head;
		        ListNode temp = null;
		        ListNode temp1 = null;
		        while(cur != null){
		        	if(cur==head){
		        		if(cur.next!=null){
		        			temp = cur.next;
		        			cur.next = cur.next.next;
		        			temp.next = cur;
		        			
		        			head = temp;
		        			
		        		}else{
		        			return head;
		        		}
		        	}else{
		        			if(cur.next!=null&&cur.next.next!=null){
		        				temp = cur.next;
		        				cur.next = cur.next.next;
		        				temp1 = cur.next.next;
		        				cur.next.next = temp;
		        				temp.next=temp1;
		        				
		        				cur = cur.next.next;
		        			}else{
		        				return head;
		        			}
		        		//}
		        	}
		        }
		        return head;
		    }
	    
		}

