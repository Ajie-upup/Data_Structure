package Mode00_LeetCode.class07_回溯;

import java.util.*;

/**
 * @author ajie
 * @date 2023/4/13
 * @description:
 */
public class code06_分割回文串 {
    List<List<String>> res = new ArrayList<>();
    Deque<String> deque = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backTracking(s, 0);
        return res;
    }

    private void backTracking(String s, int startIndex) {
        //如果起始位置大于s的大小，说明找到了一组分割方案
        if (startIndex >= s.length()) {
            res.add(new ArrayList<>(deque));
            return;
        }
        for (int index = startIndex; index < s.length(); index++) {
            // 如果是startIndex - index 截取 s 为回文串，将字符串加入到队列中
            if (isPalindrome(s, startIndex, index)) {
                // substring 截取字符串含首不含尾
                String str = s.substring(startIndex, index + 1);
                deque.offerLast(str);
            } else {
                continue;
            }
            backTracking(s, index + 1);
            deque.removeLast();
        }

    }

    //判断是否是回文串
    private boolean isPalindrome(String s, int startIndex, int end) {
        for (int i = startIndex, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}
