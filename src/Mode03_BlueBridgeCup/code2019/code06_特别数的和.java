package Mode03_BlueBridgeCup.code2019;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code06_特别数的和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        sc.close();
        for (int i = 1; i <= num; i++) {
            String temp = i + "";
            if (temp.indexOf("2") != -1 || temp.indexOf("0") != -1 || temp.indexOf("1") != -1 || temp.indexOf("9") != -1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
