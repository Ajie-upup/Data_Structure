package Mode01_BeautifulAlgorithm.class01_BitOperation.skill;

/**
 * @author ajie
 * @date 2023/3/20
 * @description: 使用位运算判断奇偶数
 */
public class skill01_判断奇偶数 {
    public static void main(String[] args) {
        System.out.println("4 & 1 = " + (4 & 1));
        isEvenOrOdd(4);
        System.out.println("5 & 1 = " + (5 & 1));
        isEvenOrOdd(5);
        System.out.println("6 & 1 = " + (6 & 1));
        isEvenOrOdd(6);
        System.out.println("7 & 1 = " + (7 & 1));
        isEvenOrOdd(7);
    }

    /**
     * 判断一个数是否为偶数
     *
     * @param num
     */
    public static void isEvenOrOdd(int num) {
        System.out.println(num + " 是一个" + ((num & 1) == 0 ? "偶数" : "奇数"));
    }

}
