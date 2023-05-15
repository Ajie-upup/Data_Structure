package AjieLeetcode.InterviewClassic;

/**
 * @author ajie
 * @date 2023/5/15
 * @description:
 */
public class code010_跳跃游戏II {
    public int jump(int[] nums) {
        int end = 0;
        int step = 0;
        int maxPosition = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                step++;
            }
        }
        return step;
    }
}
