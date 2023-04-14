package Mode00_LeetCode.class09_动态规划;

/**
 * @author ajie
 * @date 2023/4/14
 * @description:
 */
public class code05_不同路径2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[] paths = new int[obstacleGrid[0].length];
        paths[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] == 1) {
                    paths[i] = 0;
                } else if (i > 0) {
                    paths[i] += paths[i - 1];
                }
            }
        }
        return paths[paths.length - 1];
    }
}
