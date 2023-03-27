package Mode01_BeautifulAlgorithm.class02_SeekAndSort.skill;

/**
 * @author ajie
 * @date 2023/3/22
 * @description:
 */
public class code01_递归练习 {
    /**
     * 找重复：
     * 找变化：变化的量作为参数
     * 找边界：
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    static int function1(int n) {
        if (n == 1) {
            return 1;
        }
        return n * function1(n - 1);
    }
}
