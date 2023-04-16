package Mode05_AcWing.class01_基础算法.coding05_前缀和与差分;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code01_前缀和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n + 1];
        int[] sums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = sc.nextInt();
            sums[i] += sums[i - 1] + nums[i];
        }
        while (m-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(sums[r] - sums[l - 1]);
        }
    }
}
