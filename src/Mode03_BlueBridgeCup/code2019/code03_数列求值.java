package Mode03_BlueBridgeCup.code2019;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code03_数列求值 {
    public static void main(String[] args) {
        int[] nums = new int[20190324];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 1;
        for (int i = 3; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2] + nums[i - 3];
            nums[i] = nums[i] % 10000;
        }
        System.out.println(nums[20190323]);
    }

}
