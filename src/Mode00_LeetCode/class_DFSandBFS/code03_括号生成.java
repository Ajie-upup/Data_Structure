package Mode00_LeetCode.class_DFSandBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ajie
 * @date 2023/4/7
 * @description:
 */
public class code03_括号生成 {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return res;
        }
        dfs(0, 0, n, "");
        return res;
    }

    public void dfs(int left, int right, int n, String s) {
        if (left == n && right == n) {
            res.add(s);
            return;
        }
        // 添加左括号
        if (left < n) {
            dfs(left + 1, right, n, s + "(");
        }
        // 添加右括号(right < n && right < left)
        if (right < left) {
            dfs(left, right + 1, n, s + ")");
        }
    }

    public List<String> bfs(int n) {
        if (n == 0) {
            return res;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node("", n, n));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.left == 0 && node.right == 0) {
                res.add(node.val);
            }
            if (node.left > 0) {
                queue.add(new Node(node.val + "(", node.left - 1, node.right));
            }
            if (node.right > 0 && node.left < node.right) {
                queue.add(new Node(node.val + ")", node.left, node.right - 1));
            }
        }
        return res;
    }


    class Node {
        private String val;
        private int left;
        private int right;

        public Node(String val, int left, int right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
