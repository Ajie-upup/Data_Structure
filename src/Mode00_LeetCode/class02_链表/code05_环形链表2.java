package Mode00_LeetCode.class02_链表;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code05_环形链表2 {
    /**
     * 找到环形链表中的第一个入环节点：(快慢指针)
     * 1.快指针走两步，慢指针走一步，找到第一个相遇的节点
     * 2.将其中一个指针指向首节点，快指针，慢指针走一步，第一个相遇的节点就是入环节点
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head.next;
        ListNode fast = slow.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                //第一次 slow 和 fast 相遇证明链表有环
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }
}
