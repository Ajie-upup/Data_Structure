package Mode03_BlueBridgeCup.code2019;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code07_外卖店优先级 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        //定义brr[n][t]二维数组，表示第n个店的t时刻有多少订单
        int[][] brr = new int[n + 1][t + 1];
        int a = 0;
        int b = 0;
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();//第a时刻
            b = sc.nextInt();//第b个店
            brr[b][a] += 1;//在b店的a时刻的订单数
        }
        sc.close();
        int ans = 0;//用来记录这个店是否在缓存中的数量，即最终答案
        for (int i = 1; i < n + 1; i++) {
            int prior = 0;//用于判断第i个店的优先级
            boolean position = false;//用于判断第i个店第j时刻是在缓存里还是缓存外
            for (int j = 1; j < t + 1; j++) {
                if (brr[i][j] == 0) {//当第i个店的j时刻没有订单时，优先级要减一，同时最小为0
                    prior -= 1;
                    prior = prior >= 0 ? prior : 0;
                } else {
                    prior += 2 * brr[i][j];//有订单，优先级则乘2
                }
                if (prior > 5) position = true;//若此时优先级大于5，则在缓存里面
                if (prior <= 3) position = false;//若此时优先级小于等于3，则肯定在缓存外面
            }
            if (position) ans++;//把第i个店的所以时间点都判断完，最终看这个店的位置，缓存里则ans加一
        }
        System.out.println(ans);
    }
}


