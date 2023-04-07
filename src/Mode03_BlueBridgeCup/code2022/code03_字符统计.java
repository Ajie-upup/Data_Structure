package Mode03_BlueBridgeCup.code2022;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code03_字符统计 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] charArray = new int[26];
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'A';
            charArray[index]++;
            max = max > charArray[index] ? max : charArray[index];
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == max) {
                System.out.print((char) ('A' + i));
            }
        }
    }
}
