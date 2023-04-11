package Mode00_LeetCode.class05_栈和队列;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code02_用队列实现栈 {
    /**
     * 使用一个双端队列模拟
     */
    class MyStack {
        Deque<Integer> deque;

        public MyStack() {
            deque = new LinkedList<>();
        }

        public void push(int x) {
            deque.addLast(x);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int top() {
            return deque.getLast();
        }

        public boolean empty() {
            return deque.isEmpty();
        }
    }

    /**
     * 使用一个队列模拟
     */
    class MyStack2 {
        Queue<Integer> queue;

        /**
         * Initialize your data structure here.
         */
        public MyStack2() {
            queue = new LinkedList<Integer>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            int n = queue.size();
            queue.offer(x);
            for (int i = 0; i < n; i++) {
                queue.offer(queue.poll());
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            return queue.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return queue.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

}
