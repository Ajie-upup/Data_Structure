package Mode05_AcWing.class01_基础算法.coding06_双指针算法;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code01_最长连续不重复子序列 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] refer = new int[100010];
        int res = 0;
        for (int i = 0, j = 0; i < n; i++) {
            // 使用开辟数组的方式存储区间内部值的数量
            refer[nums[i]]++;
            while (refer[nums[i]] > 1) {
                // 移动 j，使区间内不存在两个相等的元素
                refer[nums[j]]--;
                j++;
            }
            // 更新结果
            res = Math.max(res, i - j + 1);
        }
        System.out.println(res);
    }
}
