package Mode00_LeetCode.class05_栈和队列;

import java.util.Stack;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code01_用栈实现队列 {
    class MyQueue {

        Stack<Integer> inStack;
        Stack<Integer> outStack;

        public MyQueue() {
            inStack = new Stack<>();
            outStack = new Stack<>();
        }

        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            if (!outStack.isEmpty()) {
                return outStack.pop();
            }
            // 将入栈中的元素全部压入出栈
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
            return outStack.pop();
        }

        public int peek() {
            if (!outStack.isEmpty()) {
                return outStack.peek();
            }
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
            return outStack.peek();
        }

        /**
         * 当两个栈中的元素都为空才返回true
         */
        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }
    }
}
