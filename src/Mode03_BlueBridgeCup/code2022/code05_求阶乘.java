package Mode03_BlueBridgeCup.code2022;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code05_求阶乘 {

    public static long cal(long num) {
        long res = 0;
        while (num != 0) {
            res = res + num / 5;
            num /= 5;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long left = 1, right = Long.MAX_VALUE - 5;
        while (left < right) {
            long mid = left + ((right - left) >> 1);
            if (k <= cal(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (cal(right) != k) {
            System.out.println(-1);
        } else {
            System.out.println(right);
        }
    }
}
