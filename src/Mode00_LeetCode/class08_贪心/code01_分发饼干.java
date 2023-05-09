package Mode00_LeetCode.class08_贪心;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/4/22
 * @description:
 */
public class code01_分发饼干 {
    public int findContentChildren(int[] children, int[] cookie) {
        int m = children.length;
        int n = cookie.length;
        Arrays.sort(children);
        Arrays.sort(cookie);
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
