package Mode03_BlueBridgeCup.must;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code01_跑步锻炼 {
    public static void main(String[] args) {
        int[] MonthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int num = 1;
        int ans = 1;
        List<Integer> monthDay = new ArrayList<>();
        for (int year = 2000; year <= 2020; year++) {
            MonthDay[1] = 28;
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                MonthDay[1] = 29;
            }
            for (int month = 0; month < MonthDay.length; month++) {
                if (year == 2020 && month == 9) {
                    break;
                }
                num += MonthDay[month];
                monthDay.add(num);
                ans++;
            }
        }
        ans += num;
        for (int i = 3; i < num; i += 7) {
            if (monthDay.contains(i)) {
                continue;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
