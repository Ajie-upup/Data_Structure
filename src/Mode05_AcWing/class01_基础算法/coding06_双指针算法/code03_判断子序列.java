package Mode05_AcWing.class01_基础算法.coding06_双指针算法;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code03_判断子序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                i++;
            }
            // 不管是否匹配，j下标都向后走一步
            j++;
        }
        if (i == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
