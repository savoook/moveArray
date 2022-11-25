package mergeTwoSortedLists;

import elements.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(6, null);
        ListNode listNode2 = new ListNode(5, null);
        ListNode listNode3 = new ListNode(4, listNode1);
        ListNode listNode4 = new ListNode(3, listNode2);
        ListNode listNode5 = new ListNode(2, listNode3);
        ListNode listNode6 = new ListNode(1, listNode4);
        System.out.println(solution.mergeTwoLists(listNode5, listNode6));
    }
}
