package Mode00_LeetCode.class02_链表;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code03_两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1, head);
        // pre 指向需要交换的前一个节点
        ListNode pre = dummy;
        while (pre.next != null && pre.next.next != null) {
            ListNode node1 = pre.next;
            ListNode node2 = pre.next.next;
            // 将 pre 指向交换后的第一个节点 node1
            pre.next = node2;
            // 将交换后的第二个节点 node1 接入链表中
            node1.next = node2.next;
            // 串联 node2 -> node1
            node2.next = node1;
            // 将 pre 节点指向下一组需要交换的节点的前一个节点
            pre = node1;
        }
        return dummy.next;
    }
}
