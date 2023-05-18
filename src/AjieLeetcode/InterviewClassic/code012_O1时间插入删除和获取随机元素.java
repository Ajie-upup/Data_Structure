package AjieLeetcode.InterviewClassic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author ajie
 * @date 2023/5/18
 * @description:
 */
public class code012_O1时间插入删除和获取随机元素 {

    /**
     * list 中的 remove 方法传入参数为 int 类型，删除的时索引下标指定的元素
     * 传递的为 Integer 类型删除的才是值为传递的值的元素
     */
    class RandomizedSet {
        private List<Integer> list;

        public RandomizedSet() {
            list = new ArrayList<>();
        }

        public boolean insert(int val) {
            Integer num = val;
            if (list.contains(num)) return false;
            list.add(num);
            return true;
        }

        public boolean remove(int val) {
            Integer num = val;
            if (!list.contains(num)) return false;
            list.remove(num);
            return true;
        }

        public int getRandom() {
            if (list.size() == 0) return 0;
            if (list.size() == 1) return list.get(0);
            int size = list.size();
            int index = (int) (Math.random() * size);
            return list.get(index);
        }
    }
}
