package Mode03_BlueBridgeCup.code2022;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code02_山 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2022; i <= 2022222022; i++) {
            if (function(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean function(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int len = chars.length;
        for (int i = 1; i < (len / 2 + len % 2); i++) {
            if (chars[i] < chars[i - 1]) {
                return false;
            }
        }
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
