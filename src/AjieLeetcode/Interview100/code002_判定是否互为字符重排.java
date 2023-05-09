package AjieLeetcode.Interview100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code002_判定是否互为字符重排 {
    public boolean CheckPermutation(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s1.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character c : s2.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                if (map.get(c) > 1) {
                    map.put(c, map.get(c) - 1);
                } else {
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
}
