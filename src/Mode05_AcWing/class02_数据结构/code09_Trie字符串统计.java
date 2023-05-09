package Mode05_AcWing.class02_数据结构;

import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/22
 * @description:
 */
public class code09_Trie字符串统计 {
    static int[][] trie = new int[100010][26];
    static int[] chars = new int[26];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (--n > 0) {
            String option = sc.next();
            String s = sc.next();
            if (option.equals("I")) {
                insert(s);
            } else {
                query(s);
            }
        }
    }

    public static void insert(String s) {
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            trie[depth][s.charAt(i) - 'a']++;
            depth++;
        }
        chars[s.charAt(s.length() - 1) - 'a']++;
    }

    public static void query(String s) {
        int depth = 0;

    }
}
