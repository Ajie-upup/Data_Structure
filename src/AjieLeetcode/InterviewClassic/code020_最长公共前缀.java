package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/20
 * @description:
 */
public class code020_最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String str = strs[0];
        int len = str.length();
        int count = strs.length;
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return str.substring(0, i);
                }
            }
        }
        return str;
    }
}
