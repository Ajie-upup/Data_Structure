package Mode00_LeetCode.class05_栈和队列;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code04_删除字符串中的所有相邻重复项 {
    public String removeDuplicates(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (deque.isEmpty()) {
                deque.addLast(c);
                continue;
            }
            if (c != deque.getLast()) {
                deque.addLast(c);
            } else {
                deque.removeLast();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.removeFirst());
        }
        return sb.toString();
    }
}
