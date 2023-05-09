package AjieLeetcode.Interview100;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code05_一次编辑 {
    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) >= 2) {
            return false;
        }
        return true;
    }
}
