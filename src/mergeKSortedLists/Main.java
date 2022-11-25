package mergeKSortedLists;

import elements.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(7);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode3 = new ListNode(5, listNode1);
        ListNode listNode4 = new ListNode(4, listNode2);
        ListNode listNode5 = new ListNode(3, listNode3);
        ListNode listNode6 = new ListNode(2, listNode4);
        ListNode[] lists = new ListNode[]{
            listNode1, listNode2, listNode3, listNode4, listNode5, listNode6
        } ;
        ListNode listNode = solution.mergeKLists(lists);
    }
}
