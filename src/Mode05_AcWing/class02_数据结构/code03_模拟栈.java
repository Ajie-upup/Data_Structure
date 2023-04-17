package Mode05_AcWing.class02_数据结构;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/17
 * @description:
 */
public class code03_模拟栈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int idx = 0;
        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("push")) {
                int x = sc.nextInt();
                nums[idx++] = x;
            } else if (op.equals("query")) {
                System.out.println(nums[idx - 1]);
            } else if (op.equals("pop")) {
                idx--;
            } else {
                System.out.println(idx == 0 ? "YES" : "NO");
            }
        }
    }
}
