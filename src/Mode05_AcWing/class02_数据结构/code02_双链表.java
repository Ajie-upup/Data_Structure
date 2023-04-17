package Mode05_AcWing.class02_数据结构;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/17
 * @description:
 */
public class code02_双链表 {
    static int[] left;
    static int[] right;
    static int[] e;

    static int idx = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        left = new int[n];
        right = new int[n];
        e = new int[n];
        // 0和 1 代表 头和尾
        left[1] = 0;
        right[0] = 1;
        int k, x;
        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("R")) {
                // 最右边插入在指向 1的那个点的右边插入
                x = sc.nextInt();
                add(left[1], x);
            } else if (op.equals("L")) {
                // 最左边插入就是在指向0的数的左边插入，也就是可以直接在 0 的右边插入
                x = sc.nextInt();
                add(0, x);
            } else if (op.equals("D")) {
                k = sc.nextInt();
                remove(k + 1);
            } else if (op.equals("IL")) {
                k = sc.nextInt();
                x = sc.nextInt();
                add(left[k + 1], x);
            } else {
                k = sc.nextInt();
                x = sc.nextInt();
                add(k + 1, x);
            }
        }
        for (int i = right[0]; i != 1; i = right[i]) {
            System.out.print(e[i] + " ");
        }
    }

    /**
     * 在 k 的右边插入 x
     */
    public static void add(int k, int x) {
        e[idx] = x;
        left[idx] = k;
        right[idx] = right[k]; // 这边的 k 不加 1 ， 输入的时候 k+1 就好
        left[right[k]] = idx;
        right[k] = idx++;
    }

    /**
     * 删除第 k 个元素
     */
    public static void remove(int k) {
        right[left[k]] = right[k];
        left[right[k]] = left[k];
    }
}
