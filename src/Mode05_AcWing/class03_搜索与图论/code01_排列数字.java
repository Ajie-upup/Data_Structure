package Mode05_AcWing.class03_搜索与图论;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/27
 * @description:
 */
public class code01_排列数字 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        boolean[] used = new boolean[n + 1];
        dfs(nums, used, 0);
    }

    /**
     * 深度优先遍历
     */
    public static void dfs(int[] nums, boolean[] used, int depth) {
        if (depth == nums.length) {
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i < used.length; i++) {
            if (!used[i]) {
                nums[depth] = i;
                used[i] = true;
                dfs(nums, used, depth + 1);
                used[i] = false;
            }
        }
    }
}
