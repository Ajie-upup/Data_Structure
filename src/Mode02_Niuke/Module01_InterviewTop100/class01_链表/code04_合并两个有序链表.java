package Mode02_Niuke.Module01_InterviewTop100.class01_链表;

/**
 * @author ajie
 * @date 2023/3/20
 * @description:
 */
public class code04_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            // 移动 current 节点
            current = current.next;
        }
        current.next = list1 == null ? list2 : list1;
        return dummy.next;
    }
}
