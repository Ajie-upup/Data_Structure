package Mode02_Niuke.Module01_InterviewTop100.class01_链表;

/**
 * @author ajie
 * @date 2023/3/20
 * @description:
 */
public class code02_链表在指定区间内反转 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 因为头节点有可能发生变化，使用虚拟头节点可以避免复杂的分类讨论
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode pre = dummyNode;
        // 记录 m 的上一个节点
        int i = 0;
        while (pre != null && i < left - 1) {
            pre = pre.next;
            i++;
        }

        // 记录第 n 节点
        ListNode end = pre;
        while (end != null && i < right) {
            end = end.next;
            i++;
        }
        ListNode start = pre.next;
        ListNode next = end.next;

        pre.next = null;
        end.next = null;

        ReverseList(start);

        pre.next = end;
        start.next = next;

        return dummyNode.next;
    }

    public void ReverseList(ListNode head) {
        ListNode last = null;
        while (head != null) {
            ListNode nextHead = head.next;
            head.next = last;
            last = head;
            head = nextHead;
        }
    }
}
