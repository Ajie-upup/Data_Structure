package Mode05_AcWing.class01_基础算法.coding03_二分;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description: 浮点数的三次方根
 */
public class code02_数的三次方根 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        double l = -10000, r = 10000;
        while (r - l > 1e-8) {
            double mid = (l + r) / 2;
            if (mid * mid * mid >= num) r = mid;
            else l = mid;
        }
        // 默认保留六位小数
        System.out.printf("%f", l);
    }
}
