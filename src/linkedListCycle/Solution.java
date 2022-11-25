package linkedListCycle;


import elements.ListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nods = new HashSet<>();
        while (head!=null){
            if (nods.contains(head)){
                return true;
            } else{
                nods.add(head);
                head = head.next;
            }
        }
        return false;
    }
}
