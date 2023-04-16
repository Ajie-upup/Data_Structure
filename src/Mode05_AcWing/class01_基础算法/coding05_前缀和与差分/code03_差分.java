package Mode05_AcWing.class01_基础算法.coding05_前缀和与差分;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code03_差分 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n + 1];
        // 防止数组下标越界
        int[] b = new int[n + 2];
        for (int i = 1; i <= n; i++) {
            nums[i] = sc.nextInt();
            insert(b, i, i, nums[i]);
        }
        while (m-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int c = sc.nextInt();
            insert(b, l, r, c);
        }
        for (int i = 1; i <= n; i++) {
            b[i] += b[i - 1];
            System.out.print(b[i] + " ");
        }
    }

    public static void insert(int[] b, int l, int r, int c) {
        b[l] += c;
        b[r + 1] -= c;
    }
}
