package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @auther 田义会
 * @date 2022/4/7 17:18
 * @description leetcode 141、判断链表是否有环
 */


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class HasCircle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        if (head == null) return false;
        set.add(head);
        while (node.next != null) {
            if (set.contains(node.next)) {
                return true;
            } else {
                set.add(node.next);
                node = node.next;
            }
        }
        return false;

    }

}
