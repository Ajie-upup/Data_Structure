package Mode03_BlueBridgeCup.Day01_;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/3/21
 * @description:
 */
public class Code04_ {
    /*
    给定三个整数数组
        满足条件：
        1.A[i]<B[j]<C[k]
        2.1<i,j,k<N
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            C[i] = scan.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        int a = 0, c = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            while (a < n && A[a] < B[i]) {
                a++;
            }
            while (c < n && B[i] >= C[c]) {
                c++;
            }
            ans += 1L * a * (n - c);
        }
        System.out.println(ans);
        scan.close();
    }
}
