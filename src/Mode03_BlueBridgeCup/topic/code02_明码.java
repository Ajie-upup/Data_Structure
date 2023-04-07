package Mode03_BlueBridgeCup.topic;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code02_明码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] n = new int[10][32];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 32; j++) {
                n[i][j] = sc.nextInt();
            }
        }

        sc.close();

        int count = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 32; j++) {
                String temp = Integer.toBinaryString(n[i][j]);
                if (temp.length() < 8) {
                    while (temp.length() != 8) {
                        temp = "0" + temp;
                    }
                } else {
                    temp = temp.substring(temp.length() - 8, temp.length());
                }
                System.out.print(temp);
                if (count % 2 == 0) {
                    System.out.println();
                }
                count++;
            }
        }
    }
}
