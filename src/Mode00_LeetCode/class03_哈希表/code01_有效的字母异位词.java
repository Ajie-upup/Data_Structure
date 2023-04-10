package Mode00_LeetCode.class03_哈希表;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code01_有效的字母异位词 {
    /**
     * 前提：两个字符串只包含小写字母
     * 1.采用数组统计词频的方式
     */
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charArray = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            charArray[str1.charAt(i) - 'a']++;

        }
        for (int i = 0; i < str2.length(); i++) {
            charArray[str2.charAt(i) - 'a']--;
            if (charArray[str2.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
