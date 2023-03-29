package Mode04_FallingInLove.Season2.class01_排序;

/**
 * @author ajie
 * @date 2023/3/28
 * @description:
 */
public class Code05_BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 5, 6, 7, 9};
        int index = binarySearch(arr, 3);
        System.out.println("未优化的二分查找结果为：" + index);
        index = binarySearchOptimize(arr, 3);
        System.out.println("优化后的二分查找到第一个大于value的结果为：" + index);
    }

    /**
     * 缺点：如果存在多个相同的元素，返回值的下标不确定
     */
    public static int binarySearch(int[] arr, int value) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int begin = 0;
        int end = arr.length;
        while (begin < end) {
            int mid = begin + ((end - begin) >> 1);
            if (value < arr[mid]) {
                end = mid;
            } else if (value > arr[mid]) {
                begin = mid + 1;
            } else {
                // 找到符合要求的元素下标并返回
                return mid;
            }
        }
        // 没有找到元素
        return -1;
    }

    /**
     * 二分查找优化：找到第一个大于 value 的小标
     * 可以利用这一点对插入排序中找到元素最适合插入的位置进行优化
     */
    public static int binarySearchOptimize(int[] arr, int value) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int begin = 0;
        int end = arr.length;
        while (begin < end) {
            int mid = begin + ((end - begin) >> 1);
            if (value < arr[mid]) {
                end = mid;
            } else {
                begin = mid + 1;
            }
        }
        return begin;
    }

}
