package Mode00_LeetCode.class04_字符串;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code04_重复的子字符串 {
    public boolean repeatedSubstringPattern(String s) {
        return kmp(s);
    }

    private boolean kmp(String s) {
        if (s.equals("")) {
            return false;
        }
        int len = s.length();
        char[] chars = s.toCharArray();
        int[] next = new int[len];
//        next[0] = 0;
        // 构建next数组表示最长公共前后缀的长度
        for (int i = 1, j = 0; i < len; i++) {
            while (j > 0 && chars[i] != chars[j]) {
                j = next[j - 1];
            }
            if (chars[i] == chars[j]) {
                j++;
            }
            next[i] = j;
        }
        return next[len - 1] > 0 && len % (len - next[len - 1]) == 0;
    }
}
