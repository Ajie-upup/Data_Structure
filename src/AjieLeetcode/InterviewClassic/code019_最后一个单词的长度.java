package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/20
 * @description:
 */
public class code019_最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int index = s.lastIndexOf(" ");
        return s.length() - 1 - index;
    }
}
