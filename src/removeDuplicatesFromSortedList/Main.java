package removeDuplicatesFromSortedList;

import elements.ListNode;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode5 = new ListNode(1);
        //ListNode listNode4 = new ListNode(3, listNode5);
       // ListNode listNode3 = new ListNode(3, listNode4);
       // ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode5);
        ListNode head = new ListNode(1, listNode1);
        solution.deleteDuplicates(head);
    }
}
