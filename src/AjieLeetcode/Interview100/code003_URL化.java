package AjieLeetcode.Interview100;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code003_URL化 {
    public String replaceSpaces(String s, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            Character c = s.charAt(i);
            if (c.equals(' ')) {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
