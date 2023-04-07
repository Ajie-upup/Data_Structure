package Mode03_BlueBridgeCup.code2021;

/**
 * @author ajie
 * @date 2023/4/6
 * @description:
 */
public class code02_卡片 {
    public static void main(String[] args) {
        int[] card = new int[10];
        for (int i = 0; i < card.length; i++) {
            card[i] = 2021;
        }
        int num = 1;
        out:
        while (true) {
            String s = String.valueOf(num);
            String[] split = s.split("");
            for (int i = 0; i < split.length; i++) {
                int index = Integer.parseInt(split[i]);
                if (card[index] > 0) {
                    card[index]--;
                } else {
                    break out;
                }
            }
            num++;
        }
        System.out.println(num - 1);
    }
}
