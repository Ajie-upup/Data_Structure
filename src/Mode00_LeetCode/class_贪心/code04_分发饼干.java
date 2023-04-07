package Mode00_LeetCode.class_贪心;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/4/7
 * @description:
 */
public class code04_分发饼干 {

    public int findContentChildren(int[] children, int[] cookie) {
        Arrays.sort(children);
        Arrays.sort(cookie);
        int m = children.length, n = cookie.length;
        int count = 0;
        for (int i = 0, j = 0; i < m && j < n; i++, j++) {
            while (j < n && children[i] > cookie[j]) {
                j++;
            }
            if (j < n) {
                count++;
            }
        }
        return count;
    }
}
