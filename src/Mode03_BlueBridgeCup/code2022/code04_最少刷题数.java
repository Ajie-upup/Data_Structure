package Mode03_BlueBridgeCup.code2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code04_最少刷题数 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        /**
         * 第一行包含一个正整数 N。
         * 第二行包含 N 个整数：A1, A2, A3, . . . , AN.
         */
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] items = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(items[i]);
        }

        //对于每一名学生，请你计算他至少还要再刷多少道题，才能使得全班刷题
        //比他多的学生数不超过刷题比他少的学生数。
        int[] copyarr = Arrays.copyOfRange(arr, 0, arr.length);
        //将新的复制数组进行排序
        Arrays.sort(copyarr);
        int median = copyarr[copyarr.length >> 1];
        int result[] = new int[arr.length];

        int lage = 0;//是否加1的控制开关 默认不加
        int bigger = 0;
        int smaller = 0;
        int mid = 0;
        //找出比中间值大的数有多少 比中间值小的数有多少
        for (int i = 0; i < arr.length; i++) {
            if (copyarr[i] > median) {
                bigger++;
            } else if (copyarr[i] < median) {
                smaller++;
            }
        }

        if (bigger >= smaller) {
            lage = 1;
        }

        if (bigger > smaller) {
            mid = 1;
        }

        for (int i = 0; i < result.length; i++) {
            if (arr[i] < median) {
                result[i] = median + lage - arr[i];
            } else if (arr[i] == median && mid == 1) {
                result[i] = median + mid - arr[i];
            } else {
                result[i] = 0;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        br.close();
    }
}
