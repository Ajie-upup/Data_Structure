package Mode01_BeautifulAlgorithm.class03_MultidimensionalArraysAndMatrices;

/**
 * @author ajie
 * @date 2023/3/23
 * @description: https://leetcode.cn/problems/zero-matrix-lcci/
 */
public class Code02_将0所在的行和列清零 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
        };
        function(matrix);
    }

    public static int[][] function(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] rowRecord = new int[row];
        int[] colRecord = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rowRecord[i] = 1;
                    colRecord[j] = 1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowRecord[i] == 1 || colRecord[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
