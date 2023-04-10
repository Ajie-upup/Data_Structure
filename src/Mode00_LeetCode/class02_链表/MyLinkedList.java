package Mode00_LeetCode.class02_链表;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class MyLinkedList {
    //链表中的元素个数
    int size;
    //虚拟头节点
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode();
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode currentNode = head;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    /**
     * 在指定位置 index 添加元素：
     * 1.判断 index 的合法性(index > size)(如果 index < 0 则插入在首节点)
     * 2.链表 size + 1
     * 3.遍历找到 index 的前一个元素
     * 4.构建节点，将节点插入到 index 前
     */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        size++;
        ListNode pre = head;
        //遍历找到需要插入节点的前一个节点
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        //构造需要添加的节点
        ListNode newNode = new ListNode(val);
        newNode.next = pre.next;
        pre.next = newNode;
    }

    /**
     * 删除 index 元素的步骤：
     * 1.判断 index 合法性(index < 0 || index >= size 不合法)
     * 2.链表 size - 1
     * 3.遍历找到 index 的前一个元素
     * 4.删除节点(pre.next = pre.next.next)
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode pre = head;
        //遍历找到需要删除节点的前一个节点
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }
}
