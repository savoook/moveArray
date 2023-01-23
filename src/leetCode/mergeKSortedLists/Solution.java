package leetCode.mergeKSortedLists;

import leetCode.elements.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> heap = new PriorityQueue((Comparator<ListNode>) (o1, o2) -> o1.val - o2.val);
        for (ListNode head : lists) {
            if (head != null) {
                heap.offer(head);
            }
        }
        ListNode pre = new ListNode(-1);
        ListNode tmp = pre;
        while (!heap.isEmpty()) {
            ListNode curr = heap.poll();
            tmp.next = new ListNode(curr.val);
            if (curr.next != null) {
                heap.offer(curr.next);
            }
            tmp = tmp.next;
        }
        return pre.next;
    }
}
