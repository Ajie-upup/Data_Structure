package Mode00_LeetCode.class04_字符串;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code03_反转字符串里面的单词 {
    public String reverseWords(String s) {
        // 去除字符串首尾部的空格
        String trim = s.trim();
        // 将按照空格分割成为字符串数组
        String[] split = trim.split(" ");
        StringBuilder sb = new StringBuilder();
        // 从尾部开始拼接字符串
        for (int i = split.length - 1; i >= 0; i--) {
            // 过滤中间可能出现的空格
            if (split[i].length() == 0) {
                continue;
            }
            sb.append(split[i]);
            // 拼接单词之间的空格
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    /**
     * 测试 split 方法遇到多个空格的情况
     */
    public static void main(String[] args) {
        String s = "a good     day";
        String[] spl = s.split(" ");
        // 中间保留的空格数为 中间的空格数 - 1
        System.out.println(spl.length);
        for (String s1 : spl) {
            System.out.println(s1);
        }
    }


}
