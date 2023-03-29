package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/3/28
 * @description:
 */
public class Code06_MergeSort {
    public static int[] leftArray;

    public static int[] array;

    public static void main(String[] args) {
        array = new int[]{7, 4, 9, 2, 78, 34, 64, 234, 8};
        leftArray = new int[array.length >> 1];
        mergeSort(0, array.length);

        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int begin, int end) {
        if (end - begin < 2) {
            return;
        }

        int mid = begin + ((end - begin) >> 1);
        mergeSort(begin, mid);
        mergeSort(mid, end);
        merge(begin, mid, end);
    }

    private static void merge(int begin, int mid, int end) {
        int li = 0, le = mid - begin;
        int ri = mid, re = end;
        int index = begin;

        for (int i = li; i < le; i++) {
            leftArray[i] = array[begin + i];
        }
        while (li < le) {
            if (ri < re && array[ri] < leftArray[li]) {
                // 右边的数组元素小，拷贝右边的数组
                array[index++] = array[ri++];
            } else {
                // 左边的数组元素小，拷贝左边的数组
                array[index++] = leftArray[li++];
            }
        }
    }


}
