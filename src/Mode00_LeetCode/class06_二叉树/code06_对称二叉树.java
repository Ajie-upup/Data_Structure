package Mode00_LeetCode.class06_二叉树;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ajie
 * @date 2023/4/12
 * @description:
 */
public class code06_对称二叉树 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(3), new TreeNode(4)));
        queueCompare(root);
    }

    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }

    /**
     * 递归比较
     */
    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) {
            return false;
        }
        if (left != null && right == null) {
            return false;
        }
        if (left == null && right == null) {
            return true;
        }
        if (left.val != right.val) {
            return false;
        }

        boolean outCompare = compare(left.left, right.right);
        boolean inCompare = compare(left.right, right.left);

        return outCompare && inCompare;
    }

    /**
     * 使用双端队列比较
     */
    private static boolean queueCompare(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root.left);
        deque.offerLast(root.right);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size / 2; i++) {
                TreeNode leftNode = deque.pollFirst();
                TreeNode rightNode = deque.pollFirst();

                if (leftNode == null && rightNode == null) {
                    continue;
                }
                if (leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
                    return false;
                }
                deque.offerLast(leftNode.left);
                deque.offerLast(rightNode.right);
                deque.offerLast(leftNode.right);
                deque.offerLast(rightNode.left);
            }
        }
        return true;
    }
}
