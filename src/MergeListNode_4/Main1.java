package MergeListNode_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import MergeListNode_4.Main.ListNode;
/**
 *  π”√PriorityQueue
 * @author linxj
 *
 */
public class Main1 {
	public static void main(String[] args){
		ListNode node1 = new ListNode(5);
		ListNode node2 = new ListNode(13);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(7);
		ArrayList<ListNode> aList = new ArrayList<ListNode>();
		aList.add(node1);
		aList.add(node2);
		aList.add(node3);
		aList.add(node4);
		aList.add(node5);
		ListNode[] nodes = {node1,node2,node3,node4,node5};
		/*node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;*/
		ListNode head = mergeKLists(aList);
		while(head!=null){
			System.out.println(" "+head.val);
			head = head.next;
		}
	}
    public static ListNode mergeKLists(List<ListNode> lists) {
        if (lists.size() == 0)
            return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.size(), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) != null)
                queue.add(lists.get(i));
        }
 
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            p.next = node;
            /*if (node.next != null)
                queue.add(node.next);*/
            p = p.next;
        }
        return head.next;
    }

}
