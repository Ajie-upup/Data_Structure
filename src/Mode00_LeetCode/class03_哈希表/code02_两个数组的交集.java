package Mode00_LeetCode.class03_哈希表;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ajie
 * @date 2023/4/10
 * @description:
 */
public class code02_两个数组的交集 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> resSet = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            temp.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (temp.contains(nums2[i])) {
                resSet.add(nums2[i]);
            }
        }
        int[] res = new int[resSet.size()];
        Iterator<Integer> iterator = resSet.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            res[index++] = iterator.next();
        }
        return res;
    }
}
