package AjieLeetcode.InterviewClassic;

import java.util.Arrays;

/**
 * @author ajie
 * @date 2023/5/18
 * @description:
 */
public class code011_H指数 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= len - i) {
                return len - i;
            }
        }
        return 0;
    }
}
