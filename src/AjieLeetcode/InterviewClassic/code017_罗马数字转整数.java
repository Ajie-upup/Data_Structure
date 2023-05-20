package AjieLeetcode.InterviewClassic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/5/20
 * @description:
 */
public class code017_罗马数字转整数 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            // 当前字母代表的值
            int value = map.get(s.charAt(i));
            // 以一个字母代表的值
            int nextValue = map.get(s.charAt(i + 1));
            if (i < s.length() - 1 && value < nextValue) {
                res -= value;
            } else {
                res += value;
            }
        }
        return res;
    }
}
