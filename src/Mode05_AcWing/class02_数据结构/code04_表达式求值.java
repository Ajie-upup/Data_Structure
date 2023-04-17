package Mode05_AcWing.class02_数据结构;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author ajie
 * @date 2023/4/17
 * @description:
 */
public class code04_表达式求值 {

    static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('+', 1);
        map.put('-', 1);
        map.put('*', 2);
        map.put('/', 2);
    }

    static Stack<Character> op = new Stack<>();//存运算符号
    static Stack<Integer> num = new Stack<>();//存数字

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            //判断c字符是不是数字
            if (Character.isDigit(c)) {
                int x = 0, j = i;
                //数字可能会是多位数，
                while (j < expression.length() && Character.isDigit(expression.charAt(j))) {
                    x = x * 10 + expression.charAt(j) - '0';
                    j++;
                }
                num.push(x);//将数字x存入数字栈栈顶
                i = j - 1;//重新赋值i
            } else if (c == '(') {
                op.push(c); // 将左括号存入字符栈栈顶
            } else if (c == ')') {
                //如果栈顶不等于左括号，一直计算下去；
                while (op.peek() != '(') {
                    eval();
                }
                op.pop(); // 将左括号弹出栈顶
            } else { //如果是正常字符
                while (!op.empty() && op.peek() != '(' && map.get(op.peek()) >= map.get(c)) {
                    eval();
                }
                op.push(c);
            }
        }
        while (!op.empty()) eval();
        System.out.println(num.peek());
    }

    public static void eval() {
        int b = num.pop();
        int a = num.pop();

        char c = op.pop();
        if (c == '+') {
            num.push(a + b);
        } else if (c == '-') {
            num.push(a - b);
        } else if (c == '*') {
            num.push(a * b);
        } else {
            num.push(a / b);
        }
    }

}
