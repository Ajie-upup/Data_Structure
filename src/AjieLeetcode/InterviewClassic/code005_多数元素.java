package AjieLeetcode.InterviewClassic;

import java.util.*;

/**
 * @author ajie
 * @date 2023/5/10
 * @description:
 */
public class code005_多数元素 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 1) + 1);
            if (map.get(num) > (nums.length / 2)) {
                list.add(num);
            }
        }
        int num = list.get(0);
        int count = map.get(num);
        for (int i = 1; i < list.size(); i++) {
            int curNum = list.get(i);
            int curCount = map.get(curNum);
            if (curCount > count) {
                num = curNum;
                count = curCount;
            } else if (curCount == count) {
                num = Math.max(num, curNum);
                count = map.get(num);
            }
        }
        return num;
    }
}
