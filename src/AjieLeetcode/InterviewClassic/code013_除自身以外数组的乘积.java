package AjieLeetcode.InterviewClassic;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/5/18
 * @description:
 */
public class code013_除自身以外数组的乘积 {
    public int[] productExceptSelf(int[] nums) {
        int result = 1;
        int indexZero = -1;
        int zeroNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result *= nums[i];
            } else {
                indexZero = i;
                zeroNum++;
                continue;
            }
        }
        if (zeroNum > 1) {
            Arrays.fill(nums, 0);
            return nums;
        }
        if (zeroNum == 1) {
            Arrays.fill(nums, 0);
            nums[indexZero] = result;
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result / nums[i];
        }
        return nums;
    }
}
