package Mode03_BlueBridgeCup.A;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/3/21
 * @description:
 */
public class Code02_ {
    /*
    乐羊羊饮料厂正在举办一次促销优惠活动。乐羊羊 C 型饮料，凭 3 个瓶盖可以再换一瓶 C 型饮料，并且可以一直循环下去(但不允许暂借或赊账)。
    请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，那么，对于他初始买入的 n 瓶饮料，最后他一共能喝到多少瓶饮料。
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int num = scan.nextInt();
        int total = num;
        while (num >= 3) {
            int extra = num / 3 ;
            total += extra;
            num = extra + num % 3;
        }
        System.out.println(total);
        scan.close();
    }
}
