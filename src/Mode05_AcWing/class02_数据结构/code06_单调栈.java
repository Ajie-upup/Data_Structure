package Mode05_AcWing.class02_数据结构;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/18
 * @description:
 */
public class code06_单调栈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int index = -1;
        while (n-- > 0) {
            int x = sc.nextInt();
            // 如果当前栈顶元素大于输入元素，就将栈顶元素弹出，知道找到第一个小于输入元素的值，或者直接返回
            while (index != -1 && nums[index] >= x) {
                index--;
            }
            if (index == -1) {
                System.out.print("-1 ");
            } else {
                System.out.println(nums[index] + " ");
            }
            nums[++index] = x;
        }

    }
}
