package Mode03_BlueBridgeCup.code2019;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code04_数的分解 {

    public static void main(String[] args) {
        int num = 2019;
        int count = 0;
        for (int i = 1; i < num; i++) {
            if ((i + "").indexOf("2") != -1 || (i + "").indexOf("4") != -1) {
                continue;
            }
            for (int j = i + 1; j < num; j++) {
                if ((j + "").indexOf("2") != -1 || (j + "").indexOf("4") != -1) {
                    continue;
                }
                int k = num - i - j;
                if ((k + "").indexOf("2") != -1 || (k + "").indexOf("4") != -1) {
                    continue;
                }
                if (k <= 0) {
                    continue;
                }
                if (i == k || i == j || k == j) {
                    continue;
                }
                count++;
            }
        }
        System.out.println(count / 3);
    }
}
