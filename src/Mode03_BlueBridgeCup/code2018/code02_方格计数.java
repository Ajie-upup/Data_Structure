package Mode03_BlueBridgeCup.code2018;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code02_方格计数 {
    public static void main(String[] args) {
        long r = 50000L;
        long count = 0;
        for (long i = 1; i <= r; i++) {
            for (long j = 1; j <= r; j++) {
                if (i * i + j * j < r * r) {
                    count++;
                }
            }
        }
        System.out.println(count * 4);
    }
}
