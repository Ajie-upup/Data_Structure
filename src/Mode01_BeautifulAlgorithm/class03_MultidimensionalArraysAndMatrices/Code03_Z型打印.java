package Mode01_BeautifulAlgorithm.class03_MultidimensionalArraysAndMatrices;

/**
 * @author ajie
 * @date 2023/3/23
 * @description:
 */
public class Code03_Z型打印 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8},
        };
        printArray(matrix);
    }

    public static void printArray(int[][] matrix) {
        int row = 0, col = 0, m = matrix.length, n = matrix[0].length;
        boolean flag = true;
        while (row < m && col < n) {
             if (flag) {
                System.out.println(matrix[row][col] + " ");
                //位于第一行，只能往右走
                if (row == 0 && col < n - 1) {
                    flag = !flag;
                    col++;
                    continue;
                } else if (row > 0 && col == n - 1) {
                    //在最后一列，只能往下走
                    flag = !flag;
                    row++;
                    continue;
                } else {
                    row--;
                    col++;
                }
            } else {
                System.out.println(matrix[row][col] + " ");
                //位于第一列，只能往下走
                if (col == 0 && row < m - 1) {
                    flag = !flag;
                    row++;
                    continue;
                } else if (row == m - 1) {
                    //在最后一行，只能往右走
                    flag = !flag;
                    col++;
                    continue;
                } else {
                    row--;
                    col++;
                }
            }
        }
    }
}
