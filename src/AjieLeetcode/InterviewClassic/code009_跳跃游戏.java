package AjieLeetcode.InterviewClassic;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ajie
 * @date 2023/5/15
 * @description:
 */
public class code009_跳跃游戏 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 0, 4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; ++i) {
            if (i <= rightmost) {
                rightmost = Math.max(rightmost, i + nums[i]);
                if (rightmost >= n - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
