package Mode00_LeetCode.class05_栈和队列;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code03_有效括号 {
    private static Map<Character, Character> map = new HashMap<>();

    static {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
    }

    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                // 如果元素为map中的key，则加入栈中
                deque.addLast(c);
            } else {
                // 如果元素为map中的value
                if (deque.isEmpty()) {
                    // 此时栈中元素为空，没有与之匹配的元素
                    return false;
                }
                if (c != map.get(deque.removeLast())) {
                    // 此时栈中有元素，但是元素不匹配
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
