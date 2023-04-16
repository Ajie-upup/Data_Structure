package Mode05_AcWing.class01_基础算法.coding06_双指针算法;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code02_数组元素的目标和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0, j = m - 1; i < n; i++) {
            while (j >= 0 && a[i] + b[j] > target) {
                j--;
            }
            if (a[i] + b[j] == target) {
                System.out.println(i + " " + j);
                break;
            }
        }
    }
}
