package Mode00_LeetCode.class04_字符串;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code01_反转字符串 {

    /**
     * 使用前后指针索引反转字符串
     */
    public void reverseString(char[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
