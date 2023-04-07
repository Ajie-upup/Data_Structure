package Mode03_BlueBridgeCup.code2019;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code08_人物相关性分析 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;    //save result
        int K = sc.nextInt();
        sc.nextLine();    //nextLine吸取回车键
        String str = sc.nextLine();
        String[] words = str.split("\\s+|\\.");    //以空格和.分割出来，注意.空格的组合存放为空字符串

        //    Alice------>Bob
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Alice")) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[j].equals("Bob")) {
                        int sum = 1;    //这里要等于1
                        for (int k = i + 1; k < j; k++) {
                            sum += words[k].length() + 1;
                        }
                        if (sum <= K) {
                            res++;
                        }
                    }
                }
            }
        }

        //Bob--------->Alice
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Bob")) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[j].equals("Alice")) {
                        int sum = 1;    //这里要等于1
                        for (int k = i + 1; k < j; k++) {
                            sum += words[k].length() + 1;
                        }
                        if (sum <= K) {
                            res++;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
