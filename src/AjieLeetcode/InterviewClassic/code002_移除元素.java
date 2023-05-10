package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code002_移除元素 {
    public int removeElement(int[] nums, int val) {
        int low = 0, fast = 0;
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
