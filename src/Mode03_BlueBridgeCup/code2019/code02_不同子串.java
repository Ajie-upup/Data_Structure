package Mode03_BlueBridgeCup.code2019;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ajie
 * @date 2023/4/6
 * @description: https://www.lanqiao.cn/problems/1448/learning/?page=1&first_category_id=1&sort=students_count&name=%E4%B8%8D%E5%90%8C%E5%AD%90%E4%B8%B2
 */
public class code02_不同子串 {
    public static void main(String[] args) {
        String str = "0100110001010001";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length() + 1; i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                set.add(str.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
