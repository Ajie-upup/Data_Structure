package Mode00_LeetCode.class02_链表;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code04_删除链表的倒数第N个结点 {

    /**
     * 快慢指针
     */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        // 快指针先移动 n 步
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // 快慢指针同时移动。当快指针走完，满指针到达倒数第 n + 1 个节点
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }


    /**
     * 先找到数组的长度，再找到数组的倒数 第 n + 1 个节点
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1, head);
        // 定义方法返回链表的长度
        int len = getListLen(head);
        // 获取需要删除节点的前一个节点
        ListNode pre = dummy;
        for (int i = 1; i < len - n + 1; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return dummy.next;
    }

    private int getListLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
