package Mode05_AcWing.class01_基础算法.coding01_快速排序;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code01_快速排序 {
    /*
        1. 确定分界点
        2. 调整区间（<=x | x | >=x）
        3. 递归处理左右区间
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        quickSort(nums, 0, nums.length);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void quickSort(int[] nums, int begin, int end) {
        // 至少要有两个元素
        if (end - begin < 2) return;
        int privot = privotIndex(nums, begin, end);
        quickSort(nums, begin, privot);
        quickSort(nums, privot + 1, end);
    }

    private static int privotIndex(int[] nums, int begin, int end) {
        int index = begin + (int) (Math.random() * (end - begin));
        swap(nums, begin, index);
        int value = nums[begin];
        // 从右边开始判断
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

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
