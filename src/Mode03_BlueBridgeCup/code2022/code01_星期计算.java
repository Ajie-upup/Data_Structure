package Mode03_BlueBridgeCup.code2022;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code01_星期计算 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("20");
        BigInteger res = new BigInteger("1");
        for (int i = 0; i < 22; i++) {
            res = res.multiply(num);
        }
        BigInteger[] reses = res.divideAndRemainder(new BigInteger("7"));
//        System.out.println(reses[1]);
        System.out.println(7);
    }
}
