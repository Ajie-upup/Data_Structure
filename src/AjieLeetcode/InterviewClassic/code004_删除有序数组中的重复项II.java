package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code004_删除有序数组中的重复项II {
    public int removeDuplicates(int[] nums) {
        int len = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (count < 2) {
                    count++;
                    nums[len++] = nums[i];
                }
            } else {
                count = 1;
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
