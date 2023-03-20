package Mode02_Niuke.Module01_InterviewTop100.class01_链表;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author ajie
 * @date 2023/3/20
 * @description:
 */
public class code05_合并K个升序链表 {
    /**
     * 使用小根堆实现
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue = new PriorityQueue<>((v1, v2) -> v1.val - v2.val);
        for (ListNode node : lists) {
            if (node != null) {
                queue.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (!queue.isEmpty()) {
            ListNode minListNode = queue.poll();
            current.next = minListNode;
            current = minListNode;

            // 将已经合并的链表添加到优先队列中
            if (minListNode.next != null) {
                queue.offer(minListNode.next);
            }
        }
        return dummy.next;
    }
}
