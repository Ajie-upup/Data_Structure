package Mode00_LeetCode.class01_数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/9
 * @description:
 */
public class code06_螺旋矩阵 {

    public static void main(String[] args) {
//        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        List<Integer> integers = spiralOrder(matrix);
        System.out.println(integers.toString());
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }
        int rows = matrix.length, columns = matrix[0].length;
        int left = 0, top = 0, bottom = rows - 1, right = columns - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                res.add(matrix[top][column]);
            }
            top++;
            for (int row = top; row <= bottom; row++) {
                res.add(matrix[top][row]);
            }
            right--;
            for (int column = right; column >= left && bottom >= top; column--) {
                res.add(matrix[bottom][column]);
            }
            bottom--;
            for (int row = bottom; row >= top && left <= right; row--) {
                res.add(matrix[row][left]);
            }
            left++;
        }
        return res;
    }
}
