package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/24
 * @description:
 */
public class code023_找出字符串中第一个匹配项的下标 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        int n = haystack.length();
        int m = needle.length();
        int[] next = new int[m + 1];

        char[] chars1 = (" " + haystack).toCharArray();
        char[] chars2 = (" " + needle).toCharArray();

        // 获取 next 数组
        for (int i = 2, j = 0; i <= m; i++) {
            while (j > 0 && chars2[i] != chars2[j + 1]) j = next[j];
            if (chars2[i] == chars2[j + 1]) j++;
            next[i] = j;
        }
        // 匹配过程
        for (int i = 1, j = 0; i <= n; i++) {
            // 匹配不成功 j = next(j)
            while (j > 0 && chars1[i] != chars2[j + 1]) j = next[j];
            // 匹配成功的话，先让 j++，结束本次循环后 i++
            if (chars1[i] == chars2[j + 1]) j++;
            // 整一段匹配成功，直接返回下标
            if (j == m) return i - m;
        }
        return -1;
    }
}
