package Mode04_FallingInLove.Season2.class01_排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ajie
 * @date 2023/3/29
 * @description:
 */
public class Code08_ShellSort {

    private static int[] array;

    public static void main(String[] args) {
        array = new int[]{7, 4, 9, 2, 78, 34, 64, 234, 8};
        shellSort();
        System.out.println(Arrays.toString(array));
    }


    public static void shellSort() {
        List<Integer> stepSequence = getStepSequence();
        for (Integer step : stepSequence) {
            groupSort(step);
        }
    }

    private static void groupSort(Integer step) {
        for (int col = 0; col < step; col++) {
            for (int begin = col + step; begin < array.length; begin += step) {
                int cur = begin;
                while (cur > col && array[cur] < array[cur - step]) {
                    swap(array, cur, cur - step);
                    cur -= step;
                }
            }
        }
    }

    private static List<Integer> getStepSequence() {
        List<Integer> stepSequence = new ArrayList<>();
        int step = array.length;
        while ((step >>= 1) > 0) {
            stepSequence.add(step);
        }
        return stepSequence;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
