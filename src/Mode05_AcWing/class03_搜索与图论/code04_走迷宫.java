package Mode05_AcWing.class03_搜索与图论;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @author ajie
 * @date 2023/5/7
 * @description:
 */
public class code04_走迷宫 {
    static int[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        map = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int instance = bfs(0, 0);
        System.out.println(instance);
    }

    private static int bfs(int x, int y) {
        Deque<Point> deque = new ArrayDeque<>();
        deque.add(new Point(x, y));
        int count = 0;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                Point point = deque.pop();
                int curX = point.getX();
                int curY = point.getY();
                if (curX == map.length - 1 && curY == map[0].length - 1) {
                    return count;
                }
                if (curX + 1 < map.length - 1 && map[curX + 1][curY] != 1) {
                    deque.offerLast(new Point(curX + 1, curY));
                }
                if (curY + 1 < map[0].length - 1 && map[curX][curY + 1] != 1) {
                    deque.offerLast(new Point(curX, curY + 1));
                }
                if (curX - 1 > 0 && curX - 1 < map.length - 1 && map[curX - 1][curY] != 1) {
                    deque.offerLast(new Point(curX - 1, curY));
                }
                if (curY - 1 > 0 && curY - 1 < map[0].length - 1 && map[curX][curY - 1] != 1) {
                    deque.offerLast(new Point(curX, curY - 1));
                }
                map[curX][curY] = 1;
            }
            count++;
        }
        return count;
    }

    static class Point {
        int x;
        int y;

        public Point() {
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
