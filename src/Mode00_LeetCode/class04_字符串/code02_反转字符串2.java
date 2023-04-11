package Mode00_LeetCode.class04_字符串;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code02_反转字符串2 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int len = chars.length - 1;
        int start = 0;
        while (start < len) {
            int end = Math.min(len, start + k - 1);
            swap(chars, start, end);
            start += 2 * k;
        }
        return new String(chars);
    }

    private void swap(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
