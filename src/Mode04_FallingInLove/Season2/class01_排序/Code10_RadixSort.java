package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/4/3
 * @description: 基于计数排序实现的奇数排序
 */
public class Code10_RadixSort {
    public static int[] array = {7, 4, 9, 2, 78, 34, 64, 234, 8};

    public static void main(String[] args) {
        radixSort();
        System.out.println(Arrays.toString(array));
    }

    public static void radixSort() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int[] output = new int[array.length];
        int[] counts = new int[10];
        for (int divider = 1; divider <= max; divider *= 10) {
            countingSort(divider, output, counts);
        }
    }

    private static void countingSort(int divider, int[] output, int[] counts) {
        // 初始化 counts 数组
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        // 记录元素中最后一个数字的个数进行排序
        for (int i = 0; i < array.length; i++) {
            counts[array[i] / divider % 10]++;
        }
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }
        for (int i = array.length - 1; i >= 0; i--) {
            output[--counts[array[i] / divider % 10]] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = output[i];
        }
    }
}
