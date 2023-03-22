package Mode03_BlueBridgeCup.Day01_;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/3/21
 * @description:
 */
public class Code03_ {
    /*
    例如一块 6x5 的巧克力可以切出 6 块 2x2 的巧克力或者 2 块 3x3 的巧克力
    当然小朋友们都希望得到的巧克力尽可能大，你能帮小明计算出最大的边长是多少么？
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[][] chocolate = new int[n][2];
        for (int i = 0; i < n; i++) {
            chocolate[i][0] = scan.nextInt();
            chocolate[i][1] = scan.nextInt();
        }
        int left = 0;
        int right = 100001;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (getCount(chocolate, mid) >= k) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);
        scan.close();
    }

    public static int getCount(int[][] chocolate, int length) {
        int count = 0;
        for (int i = 0; i < chocolate.length; i++) {
            count += ((chocolate[i][0] / length) * (chocolate[i][1] / length));
        }
        return count;
    }
}
