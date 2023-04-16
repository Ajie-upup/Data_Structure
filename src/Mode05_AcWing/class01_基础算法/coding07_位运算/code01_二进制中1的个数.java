package Mode05_AcWing.class01_基础算法.coding07_位运算;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code01_二进制中1的个数 {
    /*
        位运算的两种使用方式：
            1. 求一个数的二进制中的第 k 位数字：x >> k & 1
            2. 求一个数的二进制中的最后一个 1：x & (-x)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int res = 0;
            int num = sc.nextInt();
            while (num > 0) {
                num -= lowbit(num);
                res++;
            }
            System.out.print(res + " ");
        }
    }

    public static int lowbit(int x) {
        return x & (-x);
    }
}
