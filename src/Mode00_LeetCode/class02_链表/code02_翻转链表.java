package Mode00_LeetCode.class02_链表;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code02_翻转链表 {
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
