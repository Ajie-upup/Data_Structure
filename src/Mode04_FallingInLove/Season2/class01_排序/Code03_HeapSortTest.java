package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/3/27
 * @description: 堆排序可以看作是选择排序的优化
 */
public class Code03_HeapSortTest {
    public static void main(String[] args) {
        int[] array1 = {7, 4, 9, 2, 78, 34, 64, 234, 8};
        heapSort(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static void heapSort(int[] arr) {
        // 原地建堆
        for (int i = (arr.length >> 1) - 1; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }

        for (int j = arr.length - 1; j > 0; j--) {
            swap(arr, j, 0);
            /*为什么从0开始？
                因为在第一次构建大顶堆后让堆顶元素和末尾元素进行交换
                而对于其他的非叶子结点所对应的子树都是大顶堆就无需调整，
                只需要堆顶元素(下标为0的非叶子结点)的子树调整成大顶堆
            */
            heapify(arr, 0, j);
        }
    }

    private static void heapify(int[] arr, int index, int len) {
        // 取出当前非叶子结点的值保到临时变量中
        int temp = arr[index];

        // j= i * 2 + 1 表示的是 i 结点的左子结点
        for (int j = index * 2 + 1; j < len; j = j * 2 + 1) {
            if (j + 1 < len && arr[j] < arr[j + 1]) { //左子结点小于右子结点
                j++; //j指向右子结点
            }
            if (arr[j] > temp) { //子节点大于父节点
                arr[index] = arr[j]; //把较大的值赋值给父节点
                //arr[j] = temp; 这里没必要换
                index = j; // 让i指向与其换位的子结点 因为
            } else {
                // 子树已经是大顶堆了
                break;
            }
        }
        arr[index] = temp;
    }

    private static void swap(int[] arr, int cur, int last) {
        int temp = arr[cur];
        arr[cur] = arr[last];
        arr[last] = temp;
    }

}
