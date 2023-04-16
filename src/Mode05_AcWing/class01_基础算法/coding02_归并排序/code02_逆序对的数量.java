package Mode05_AcWing.class01_基础算法.coding02_归并排序;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/15
 * @description:
 */
public class code02_逆序对的数量 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        long res = mergeSort(nums, 0, nums.length - 1);
        System.out.println(res);
    }

    private static long mergeSort(int[] nums, int begin, int end) {
        if (begin >= end) return 0;
        int mid = begin + (end - begin >> 1);
        long count = mergeSort(nums, begin, mid) + mergeSort(nums, mid + 1, end);

        int[] temp = new int[end - begin + 1];
        int k = 0, i = begin, j = mid + 1;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
                count += mid - i + 1;
            }
        }
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= end) temp[k++] = nums[j++];

        for (i = begin, j = 0; i <= end; i++, j++) {
            nums[i] = temp[j];
        }
        return count;
    }
}
