package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/3/27
 * @description:
 */
public class Code02_SelectSortTest {

    public static void main(String[] args) {
        int[] array = {7, 4, 9, 2, 78, 34, 64, 234, 8};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void selectSort(int[] arr) {
        for (int end = arr.length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int index = 0; index <= end; index++) {
                if (arr[maxIndex] < arr[index]) {
                    maxIndex = index;
                }
            }
            swap(arr, maxIndex, end);
        }
    }

    private static void swap(int[] array, int cur, int last) {
        int temp = array[cur];
        array[cur] = array[last];
        array[last] = temp;
    }


}
