package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/4/1
 * @description:
 */
public class Code09_CountingSort {

    public static void main(String[] args) {
       int[] array = new int[]{7, 4, 9, 2, 78, 34, 64, 234, 8};
        countingSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void countingSort(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        int[] counts = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            counts[array[i] - min]++;
        }
        // counts数组记录前几个数
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }
        int[] output = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            output[--counts[array[i] - min]] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }
}
