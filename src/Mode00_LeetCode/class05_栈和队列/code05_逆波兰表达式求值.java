package Mode00_LeetCode.class05_栈和队列;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code05_逆波兰表达式求值 {
    public int evalRPN(String[] tokens) {
        ArrayList<String> list = new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (list.contains(token)) {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                int res = countValue(num1, num2, token);
                stack.push(res);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }

    private int countValue(int num1, int num2, String token) {
        if (token.equals("+")) {
            return num1 + num2;
        }
        if (token.equals("-")) {
            return num2 - num1;
        }
        if (token.equals("*")) {
            return num2 * num1;
        }
        if (token.equals("/")) {
            return num2 / num1;
        }
        return 0;
    }
}
