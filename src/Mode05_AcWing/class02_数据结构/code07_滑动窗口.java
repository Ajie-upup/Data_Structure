package Mode05_AcWing.class02_数据结构;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/4/18
 * @description:
 */
public class code07_滑动窗口 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // 输出最大值
        for (int i = 0; i < nums.length; i++) {
            // 1.队列头结点需要在[i - k + 1, i]范围内，不符合则要弹出
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            // 判断队列中的元素是否符合 k 范围
            if (i >= k - 1) {
                System.out.print(nums[deque.peek()] + " ");
            }
        }
        System.out.println();
        // 输出最小值
        deque = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            // 1.队列头结点需要在[i - k + 1, i]范围内，不符合则要弹出
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] > nums[i]) {
                deque.pollLast();
            }
            deque.offer(i);
            // 判断队列中的元素是否符合 k 范围
            if (i >= k - 1) {
                System.out.println(nums[deque.peek()] + " ");
            }
        }

    }

    public void nums() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        int[] queue = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int head = 0, end = -1;
        for (int i = 0; i < n; i++) {
            if (head <= end && queue[head] < i - k + 1) {
                head++;
            }
            while (head <= end && nums[queue[end]] >= nums[i]) {
                end--;
            }
            queue[++end] = i;
            if (i >= k - 1) {
                System.out.print(nums[queue[head]] + " ");
            }
        }
        System.out.println();
        head = 0;
        end = -1;
        for (int i = 0; i < n; i++) {
            if (head <= end && queue[head] < i - k + 1) {
                head++;
            }
            while (head <= end && nums[queue[end]] <= nums[i]) {
                end--;
            }
            queue[++end] = i;
            if (i >= k - 1) {
                System.out.print(nums[queue[head]] + " ");
            }
        }
    }
}
