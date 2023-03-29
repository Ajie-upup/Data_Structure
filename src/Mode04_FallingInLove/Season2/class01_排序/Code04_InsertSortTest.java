package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/3/27
 * @description:
 */
public class Code04_InsertSortTest {

    public static void main(String[] args) {
        int[] array1 = {7, 4, 9, 2, 78, 34, 64, 234, 8};
        insertSort(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = {7, 4, 9, 2, 78, 34, 64, 234, 6};
        insertSortOptimize(array2);
        System.out.println(Arrays.toString(array2));
    }

    public static void insertSort(int[] arr) {
        for (int begin = 1; begin < arr.length; begin++) {
            int cur = begin;
            while (cur > 0 && arr[cur] < arr[cur - 1]) {
                swap(arr, cur, cur - 1);
                cur--;
            }
        }
    }

    private static void swap(int[] arr, int cur, int last) {
        int temp = arr[cur];
        arr[cur] = arr[last];
        arr[last] = temp;
    }

    /**
     * 插入排序的一点优化（将交换替换成偏移）
     */
    public static void insertSortOptimize(int[] arr) {
        for (int begin = 1; begin < arr.length; begin++) {
            int cur = begin;
            int value = arr[cur];
            while (cur > 0 && value < arr[cur - 1]) {
                arr[cur] = arr[cur - 1];
                cur--;
            }
            arr[cur] = value;
        }
    }

}
