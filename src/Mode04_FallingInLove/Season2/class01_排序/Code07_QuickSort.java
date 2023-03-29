package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/3/29
 * @description:
 */
public class Code07_QuickSort {

    private static int[] array;

    public static void main(String[] args) {
        array = new int[]{7, 4, 9, 2, 78, 34, 64, 234, 8};
        quickSort(0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int begin, int end) {
        if (end - begin < 2) return;
        int privot = privotIndex(begin, end);
        quickSort(begin, privot);
        quickSort(privot + 1, end);
    }

    /**
     * 找出快速排序之后轴点元素在数组中的位置
     */
    private static int privotIndex(int begin, int end) {
        int index = begin + (int) (Math.random() * (end - begin));
        swap(array, begin, index);
        int value = array[begin];
        // 从末尾下标开始
        end--;
        while (begin < end) {
            // 实现左右下标交换
            while (begin < end) {
                if (array[end] - value > 0) {
                    end--;
                } else {
                    array[begin++] = array[end];
                    break;
                }
            }

            while (begin < end) {
                if (array[begin] - value < 0) {
                    begin++;
                } else {
                    array[end--] = array[begin];
                    break;
                }
            }
        }
        array[begin] = value;
        return begin;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
