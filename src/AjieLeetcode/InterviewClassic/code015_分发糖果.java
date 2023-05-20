package AjieLeetcode.InterviewClassic;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/5/20
 * @description:
 */
public class code015_分发糖果 {
    public int candy(int[] ratings) {
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < left.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = right.length - 1; i > 0; i--) {
            if (ratings[i - 1] > ratings[i]) {
                right[i - 1] = right[i] + 1;
            }
        }
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            count += Math.max(left[i], right[i]);
        }
        return count;
    }
}
