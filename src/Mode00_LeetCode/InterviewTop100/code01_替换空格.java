package Mode00_LeetCode.InterviewTop100;

/**
 * @author ajie
 * @date 2023/4/23
 * @description:
 */
public class code01_替换空格 {
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
