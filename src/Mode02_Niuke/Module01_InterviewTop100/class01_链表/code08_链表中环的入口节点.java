package Mode02_Niuke.Module01_InterviewTop100.class01_链表;

/**
 * @author ajie
 * @date 2023/3/22
 * @description: https://leetcode.cn/problems/c32eOV/description/
 */
public class code08_链表中环的入口节点 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }
        // 将慢指针重置到首节点，快慢指针同时向前行进一步，最后会相遇在入环节点
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
