package Mode01_BeautifulAlgorithm.class03_MultidimensionalArraysAndMatrices;


/**
 * @author ajie
 * @date 2023/3/23
 * @description: https://leetcode.cn/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 */
public class Code01_顺时针打印矩阵 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] ints = spiralOrder(matrix);
    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) return new int[0];
        int leftUpRow = 0, leftUpCol = 0, rightDownRow = matrix.length - 1, rightDownCol = matrix[0].length - 1;
        int[] arrays = new int[(rightDownCol + 1) * (rightDownRow + 1)];
        int len = arrays.length;
        int index = 0;
        while (leftUpRow <= rightDownRow && leftUpCol <= rightDownCol) {
            int r = leftUpRow, c = leftUpCol;
            //向右
            while (c <= rightDownCol) {
                arrays[index++] = matrix[r][c++];
            }
            c = rightDownCol;
            r++;
            //向下
            while (r <= rightDownRow) {
                arrays[index++] = matrix[r++][c];
            }
            r = rightDownRow;
            c--;
            //向上
            //注意防止数组越界
            while (index < len && c >= leftUpCol) {
                arrays[index++] = matrix[r][c--];
            }
            c = leftUpCol;
            r--;
            //注意防止数组越界
            while (index < len && r > leftUpRow) {
                arrays[index++] = matrix[r--][c];
            }
            leftUpCol++;
            leftUpRow++;
            rightDownCol--;
            rightDownRow--;
        }

        return arrays;
    }
}
