package AjieLeetcode.InterviewClassic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ajie
 * @date 2023/5/20
 * @description:
 */
public class code018_整数转罗马数字 {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
            if (num == 0) {
                break;
            }
        }
        return roman.toString();
    }
}
