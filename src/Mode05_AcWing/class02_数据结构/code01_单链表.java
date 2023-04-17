package Mode05_AcWing.class02_数据结构;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/17
 * @description:
 */
public class code01_单链表 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] e = new int[n];
        int[] ne = new int[n];
        int idx = 0, head = -1;
        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("H")) {
                int x = sc.nextInt();
                e[idx] = x;
                ne[idx] = head;
                head = idx++;
            } else if (op.equals("D")) {
                int k = sc.nextInt();
                if (k == 0) {
                    head = ne[head];
                } else {
                    ne[k - 1] = ne[ne[k - 1]];
                }
            } else {
                int k = sc.nextInt();
                int x = sc.nextInt();
                e[idx] = x;
                ne[idx] = ne[k - 1];
                ne[k - 1] = idx++;
            }
        }
        for (int i = head; i != -1; i = ne[i]) {
            System.out.print(e[i] + " ");
        }
    }
}
