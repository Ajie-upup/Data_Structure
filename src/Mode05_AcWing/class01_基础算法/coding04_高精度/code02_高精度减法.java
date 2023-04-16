package Mode05_AcWing.class01_基础算法.coding04_高精度;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code02_高精度减法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        BigDecimal num1 = new BigDecimal(s1);
        BigDecimal num2 = new BigDecimal(s2);
        System.out.println(num1.subtract(num2));
    }
}
