package Mode00_LeetCode.class07_回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/13
 * @description:
 */
public class code06_复原IP地址 {
    List<String> res = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public List<String> restoreIpAddresses(String s) {
        backTracking(s, 0, 0);
        return res;
    }

    private void backTracking(String s, int start, int num) {
        if (start == s.length() && num == 4) {
            res.add(sb.toString());
            return;
        }
        if (start == s.length() || num == 4) {
            return;
        }
        // 截取子串：ip段的长度最大是3，并且ip段处于[0,255]
        for (int end = start;
             end < s.length() && end - start < 3
                     && Integer.parseInt(s.substring(start, end + 1)) >= 0 && Integer.parseInt(s.substring(start, end + 1)) <= 255;
             end++) {
            // 如果子串长度大于 1，并且首位数字为 0，直接返回
            if (end - start > 0 && s.charAt(start) == '0') {
                continue;
            }
            sb.append(s, start, end + 1);
            if (num < 3) {
                sb.append(".");
            }
            num++;
            backTracking(s, end + 1, num);
            num--;
            // 删除当前stringBuilder最后一个网段，注意考虑点的数量的问题
            sb.delete(start + num, end + num + 2);
        }
    }
}
