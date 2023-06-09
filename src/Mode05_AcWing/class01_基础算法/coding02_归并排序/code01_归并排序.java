package Mode05_AcWing.class01_基础算法.coding02_归并排序;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/15
 * @description:
 */
public class code01_归并排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        mergeSort(nums, 0, nums.length - 1);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] nums, int begin, int end) {
        if (begin >= end) return;
        int mid = begin + ((end - begin) >> 1);
        mergeSort(nums, begin, mid);
        mergeSort(nums, mid + 1, end);

        int k = 0, i = begin, j = mid + 1;
        int[] temp = new int[end - begin + 1];
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) temp[k++] = nums[i++];
        while (j <= end) temp[k++] = nums[j++];
        for (i = begin, j = 0; i <= end; i++, j++) {
            nums[i] = temp[j];
        }
    }
}
