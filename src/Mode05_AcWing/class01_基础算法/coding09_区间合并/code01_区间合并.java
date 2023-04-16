package Mode05_AcWing.class01_基础算法.coding09_区间合并;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/16
 * @description:
 */
public class code01_区间合并 {
    /*
        1.将区间按照左端点进行排序
        2.遍历，找出符合要求的元素
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Interval[] intervals = new Interval[n];
        for (int i = 0; i < n; i++) {
            int begin = sc.nextInt();
            int end = sc.nextInt();
            Interval interval = new Interval(begin, end);
            intervals[i] = interval;
        }
        Arrays.sort(intervals, 0, n, (o1, o2) -> o1.begin - o2.begin);
        int count = 0;
        int tBegin = Integer.MIN_VALUE;
        int tEnd = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (intervals[i].begin > tEnd) {
                count++;
                tBegin = intervals[i].begin;
                tEnd = intervals[i].end;
            } else {
                tEnd = Math.max(tEnd, intervals[i].end);
            }
        }
        System.out.println(count);
    }

    static class Interval {
        public int begin;
        int end;

        public Interval(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }
    }

}
