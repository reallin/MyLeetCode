package MergeListNode_4;
/**
 * 
 * @author linxj
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 *思路：堆排序。
 */
public class Main {
	public static void main(String[] args){
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(13);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(7);
		ListNode[] nodes = {node1,node2,node3,node4,node5};
		/*node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;*/
		ListNode head = mergeKLists(nodes);
		while(head!=null){
			System.out.println(" "+head.val);
			head = head.next;
		}
	}
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }
public static ListNode mergeKLists(ListNode[] lists) {
	/*if(lists == null||lists.length<=0){
		return null;
	}
	ListNode current = lists[0];
	ListNode head = current;
        for(int i = 1;i < lists.length;i++){
        	//while(current!=null){
        	current = head;
        	if(current.next!=null){
        		while(current.next.val < lists[i].val){
        			
        			current = current.next;
        		}
        		
        		//if(current.next!=null){
        			if(current == head){//替换第一个
        				lists[i].next = current;
        				head = lists[i];
        				
        			}else{
        			ListNode next = current.next;
        			current.next = lists[i];
        			current = current.next;
        			current.next = next;
        			}
        		}else{
        			current.next = lists[i];
        		}
        		
        	//}
        }else{
        	current.next = lists[i];
        }
        
    }
        return head;*/
}
}
