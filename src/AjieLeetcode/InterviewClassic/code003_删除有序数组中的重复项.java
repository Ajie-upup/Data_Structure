package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code003_删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }
}
