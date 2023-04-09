package Mode04_Interview.class01_美团面试第十场;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/9
 * @description:
 */
public class code02_正则序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < n; i++) {
            int res = nums[i] - (i + 1);
            res = res > 0 ? res : res * (-1);
            count += res;
        }
        System.out.println(count);
    }
}
