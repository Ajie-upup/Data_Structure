package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/4/3
 * @description: 基于链表 + 数组(桶排序)实现的奇数排序
 */
public class Code10_RadixSort2 {
    public static int[] array = {7, 4, 9, 2, 78, 34, 64, 234, 8};

    public static void main(String[] args) {
        radixSort2();
        System.out.println(Arrays.toString(array));
    }

    public static void radixSort2() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        // 创建桶
        int[][] buckets = new int[10][array.length];
        // 记录每个桶中的元素的个数
        int[] bucketSizes = new int[buckets.length];
        for (int divider = 1; divider <= max; divider *= 10) {
            for (int i = 0; i < array.length; i++) {
                int figure = array[i] / divider % 10;
                buckets[figure][bucketSizes[figure]++] = array[i];
            }
            int index = 0;
            for (int i = 0; i < buckets.length; i++) {
                for (int j = 0; j < bucketSizes[i]; j++) {
                    array[index++] = buckets[i][j];
                }
                bucketSizes[i] = 0;
            }
        }

    }

}
