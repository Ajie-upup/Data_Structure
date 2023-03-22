package Mode03_BlueBridgeCup.Day01_;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/3/21
 * @description:
 */
public class Code01_ {
    /*
    输入的第一行包含一个整数 n\ (1 ≤ n ≤ 10^4)n (1≤n≤10)，表示考试人数。
    接下来 n 行，每行包含一个 0 至 100 的整数，表示一个学生的得分。
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int num = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int x = scan.nextInt();
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            sum += x;
        }
        System.out.println(max);
        System.out.println(min);
        String avg = new DecimalFormat("#.00").format((sum * 1.0 / num));
        System.out.println(avg);

        scan.close();
    }
}
