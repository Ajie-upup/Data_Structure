package Mode04_Interview.class01_美团面试第十场;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/9
 * @description:
 */
public class code01_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for (int i = x; i <= y; i++) {

            if (judge(i, x, y, nums)) {
                System.out.println(nums[i - 1]);
                return;
            }
        }
        System.out.println(-1);
    }

    private static boolean judge(int res, int x, int y, int[] nums) {
        int left = res;
        int right = nums.length - left;
        if ((left >= x && left <= y) && (right >= x && right <= y)) {
            return true;
        }
        return false;
    }

}
