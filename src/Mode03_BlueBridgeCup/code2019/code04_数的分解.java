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
            if ((i + "").contains("2") || (i + "").contains("4")) {
                continue;
            }
            for (int j = i + 1; j < num; j++) {
                if ((j + "").contains("2") || (j + "").contains("4")) {
                    continue;
                }
                int k = num - i - j;
                if ((k + "").contains("2") || (k + "").contains("4")) {
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
