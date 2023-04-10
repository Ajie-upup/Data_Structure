package Mode00_LeetCode.class01_数组;

/**
 * @author ajie
 * @date 2023/4/9
 * @description:
 */
public class code02_移除元素 {

    public int removeElement1(int[] nums, int val) {
        int low = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[low++] = nums[i];
        }
        return low;
    }

    public int removeElement2(int[] nums, int val) {
        int low = 0;
        int fast = 0;
        int len = nums.length;
        while (fast < nums.length) {
            if (nums[fast] != val) {
                nums[low] = nums[fast];
                low++;
                fast++;
            } else {
                if (fast + 1 < nums.length) {
                    nums[low] = nums[fast + 1];
                }
                len--;
                fast++;
            }
        }
        return len;
    }
}
