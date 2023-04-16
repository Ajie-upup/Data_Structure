package Mode05_AcWing.class01_基础算法.coding03_二分;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code01_数的范围 {
    /**
     * 二分模板题
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        while (m-- > 0) {
            int target = sc.nextInt();
            int l = 0, r = nums.length - 1;
            while (l < r) {
                // 找到第一个大于等于 target 的元素下标
                int mid = l + (r - l >> 1);
                if (nums[mid] >= target) r = mid;
                else l = mid + 1;
            }
            if (nums[l] != target) {
                System.out.println("-1 -1");
            } else {
                System.out.print(l + " ");
                l = 0;
                r = n - 1;
                while (l < r) {
                    // 找到最后一个大于等于 target 的下标
                    int mid = l + (r - l + 1 >> 1);
                    // +1 防止进入死循环
                    if (nums[mid] <= target) l = mid;
                    else r = mid - 1;
                }
                System.out.println(l);
            }
        }
    }
}
