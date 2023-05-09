package AjieLeetcode.Interview100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code004_回文排列 {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.remove(c);
            } else {
                map.put(c, 1);
            }
        }
        return map.size() <= 1;
    }
}
