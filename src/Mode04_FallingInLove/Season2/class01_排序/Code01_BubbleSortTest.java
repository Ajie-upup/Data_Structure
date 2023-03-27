package Mode04_FallingInLove.Season2.class01_排序;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/3/27
 * @description:
 */
public class Code01_BubbleSortTest {

    public static void main(String[] args) {
        int[] array = {7, 4, 9, 2, 78, 34, 64, 234, 8};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void bubbleSort(int[] array) {
        int end = array.length - 1;
        for (int i = end; i > 0; i--) {
            for (int begin = 1; begin <= end; begin++) {
                if (array[begin] < array[begin - 1]) {
                    swap(array, begin, begin - 1);
                }
            }
        }
    }

    private static void swap(int[] array, int cur, int last) {
        int temp = array[cur];
        array[cur] = array[last];
        array[last] = temp;
    }

    /**
     * 冒泡排序的一点优化
     *
     * @param array
     */
    public static void bubbleSortOptimize(int[] array) {
        int end = array.length - 1;
        for (int i = end; i > 0; i--) {
            // 定义一个变量记录已经排序好的后面的元素的位置
            int sortedIndex = 1;
            for (int begin = 1; begin <= end; begin++) {
                if (array[begin] < array[begin - 1]) {
                    swap(array, begin, begin - 1);
                    sortedIndex = begin;
                }
            }
            end = sortedIndex;
        }
    }


}
