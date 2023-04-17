package Mode05_AcWing.class02_数据结构;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/17
 * @description:
 */
public class code05_模拟队列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int head = 0, end = 0;
        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("push")) {
                int x = sc.nextInt();
                nums[end++] = x;
            } else if (op.equals("pop")) {
                head++;
            } else if (op.equals("query")) {
                System.out.println(nums[head]);
            } else {
                System.out.println(head == end ? "YES" : "NO");
            }
        }
    }
}
