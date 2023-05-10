package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code006_轮转数组 {
    public void rotate(int[] nums, int k) {
        // 防止 k 越界
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
