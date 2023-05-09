package Mode00_LeetCode.class_面试100;

import java.math.BigDecimal;

/**
 * @author ajie
 * @date 2023/5/9
 * @description:
 */
public class code03_表示数值的字符串 {
    public boolean isNumber(String s) {
        try {
            BigDecimal num = new BigDecimal(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
