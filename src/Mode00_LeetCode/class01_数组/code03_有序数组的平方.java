package Mode00_LeetCode.class01_数组;

/**
 * @author ajie
 * @date 2023/4/9
 * @description:
 */
public class code03_有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        int right = nums.length - 1;
        int left = 0;
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                result[index--] = nums[left] * nums[left];
                left++;
            } else if (nums[left] * nums[left] < nums[right] * nums[right]) {
                result[index--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
