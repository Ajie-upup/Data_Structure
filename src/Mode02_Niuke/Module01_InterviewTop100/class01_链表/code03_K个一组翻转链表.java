package Mode02_Niuke.Module01_InterviewTop100.class01_链表;

/**
 * @author ajie
 * @date 2023/3/20
 * @description:
 */
public class code03_K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        //定义虚拟头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            // 找到第 K 个节点
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            // 如果不满足 K 个节点，直接返回
            if (end == null) {
                break;
            }
            // 取出需要翻转的区间
            ListNode start = pre.next;
            ListNode next = end.next;

            end.next = null;
            pre.next = reverseList(start);
            start.next = next;

            // 更新 pre 和 end 进入下一次循环翻转
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        while (head != null) {
            ListNode nextHead = head.next;
            head.next = last;
            last = head;
            head = nextHead;
        }
        return last;
    }
}
