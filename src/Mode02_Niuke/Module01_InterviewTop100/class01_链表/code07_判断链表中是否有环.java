package Mode02_Niuke.Module01_InterviewTop100.class01_链表;

import java.util.HashSet;

/**
 * @author ajie
 * @date 2023/3/22
 * @description: https://leetcode.cn/problems/linked-list-cycle/description/
 */
public class code07_判断链表中是否有环 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        // 双指针寻找环，如果有环，两个指针一定会相遇
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
