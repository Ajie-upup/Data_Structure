package Mode00_LeetCode.class06_二叉树;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ajie
 * @date 2023/4/12
 * @description:
 */
public class code13_找树左下角的值 {
    private int depth = -1;
    private int value = 0;

    /**
     * 递归求解
     */
    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root, 0);
        return value;
    }

    private void findLeftValue(TreeNode root, int deep) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (deep > depth) {
                value = root.val;
                depth = deep;
            }
        }
        if (root.left != null) findLeftValue(root.left, deep + 1);
        if (root.right != null) findLeftValue(root.right, deep + 1);
    }

    /**
     * 层次遍历
     */
    public int findBottomLeftValue2(TreeNode root) {
        int res = 0;
        Deque<TreeNode> deque = new LinkedList<>();
        if (root == null) {
            return -1;
        }
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.poll();
                if (i == 0) {
                    res = node.val;
                }
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
        }
        return res;
    }
}
