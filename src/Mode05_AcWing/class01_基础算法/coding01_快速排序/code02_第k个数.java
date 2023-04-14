package Mode05_AcWing.class01_基础算法.coding01_快速排序;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/15
 * @description:
 */
public class code02_第k个数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        quickSort(nums, 0, nums.length);
        System.out.println(nums[k - 1]);
    }

    private static void quickSort(int[] nums, int begin, int end) {
        if (end - begin < 2) return;
        int privot = privotIndex(nums, begin, end);
        quickSort(nums, begin, privot);
        quickSort(nums, privot + 1, end);
    }

    private static int privotIndex(int[] nums, int begin, int end) {
        int randomIndex = begin + (int) (Math.random() * (end - begin));
        swap(nums, begin, randomIndex);
        int value = nums[begin];
        // 使 end 指向第一个末尾下标所在位置
        end--;
        while (begin < end) {
            while (begin < end) {
                if (nums[end] > value) {
                    end--;
                } else {
                    nums[begin++] = nums[end];
                    break;
                }
            }
            while (begin < end) {
                if (nums[begin] < value) {
                    begin++;
                } else {
                    nums[end--] = nums[begin];
                    break;
                }
            }
        }
        nums[begin] = value;
        return begin;
    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}
