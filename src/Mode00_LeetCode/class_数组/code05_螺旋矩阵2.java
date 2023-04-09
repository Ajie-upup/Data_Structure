package Mode00_LeetCode.class_数组;

import java.util.List;

/**
 * @author ajie
 * @date 2023/4/9
 * @description:
 */
public class code05_螺旋矩阵2 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        // 控制循环次数
        int loop = 1;
        // 每次循环的开始点(start, start)
        int start = 0;
        // 定义填充数字
        int count = 1;
        // 定义数组下标运行轨迹
        int i, j;
        while (loop <= (n / 2)) {
            // 向右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }
            // 向下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }
            // 向左
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }
            // 向上
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
            loop++;
        }
        if (n % 2 != 0) {
            res[start][start] = count;
        }
        return res;
    }
}
