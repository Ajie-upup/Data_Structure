package Mode00_LeetCode.class_面试100;

/**
 * @author ajie
 * @date 2023/5/9
 * @description:
 */
public class code01_替换字符串 {
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
