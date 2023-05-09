package Mode00_LeetCode.class_面试100;

/**
 * @author ajie
 * @date 2023/5/9
 * @description:
 */
public class code02_左旋字符串 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
