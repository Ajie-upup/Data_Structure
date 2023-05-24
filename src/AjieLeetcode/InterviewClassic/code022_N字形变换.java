package AjieLeetcode.InterviewClassic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/5/24
 * @description:
 */
public class code022_N字形变换 {
    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> sbList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            sbList.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            sbList.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : sbList) {
            res.append(row);
        }
        return res.toString();
    }
}
