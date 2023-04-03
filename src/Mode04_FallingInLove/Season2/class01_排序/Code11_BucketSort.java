package Mode04_FallingInLove.Season2.class01_排序;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/3
 * @description:
 */
public class Code11_BucketSort {

    public static double[] array = {0.37, 0.44, 0.29, 0.84, 0.45, 0.38, 0.23};

    public static void main(String[] args) {
        bucketSort();
        System.out.println(Arrays.toString(array));
    }

    public static void bucketSort() {
        // 创建桶
        List<Double>[] buckets = new List[array.length];
        for (int i = 0; i < array.length; i++) {
            int bucketIndex = (int) (array[i] * array.length);
            List<Double> bucket = buckets[bucketIndex];
            if (bucket == null) {
                bucket = new LinkedList<>();
                buckets[bucketIndex] = bucket;
            }
            bucket.add(array[i]);
        }

        // 对每个桶进行排序
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] == null) continue;
            buckets[i].sort(null);
            for (Double one : buckets[i]) {
                array[index++] = one;
            }
        }
    }
}
