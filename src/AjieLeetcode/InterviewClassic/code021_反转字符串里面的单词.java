package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/24
 * @description:
 */
public class code021_反转字符串里面的单词 {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--) {
            if (split[i].length() == 0) {
                continue;
            }
            sb.append(split[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
