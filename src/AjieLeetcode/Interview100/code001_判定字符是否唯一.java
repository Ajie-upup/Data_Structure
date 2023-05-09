package AjieLeetcode.Interview100;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code001_判定字符是否唯一 {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (Character c : astr.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                return false;
            }
        }
        return true;
    }
}
