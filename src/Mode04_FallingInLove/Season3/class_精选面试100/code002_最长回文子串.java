package Mode04_FallingInLove.Season3.class_精选面试100;

/**
 * @author ajie
 * @date 2023/4/23
 * @description:
 */
public class code002_最长回文子串 {
    public static void main(String[] args) {
        String s = "babad";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
    }


    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            // i 表示回文串的中心
            int len1 = arroundWithCenter(s, i, i);
            int len2 = arroundWithCenter(s, i, i + 1);
            int maxLen = Math.max(len1, len2);
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int arroundWithCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return (right - 1) - (left + 1) + 1;
    }
}
