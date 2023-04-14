package Mode00_LeetCode.class06_二叉树;

/**
 * @author ajie
 * @date 2023/4/12
 * @description:
 */
public class code10_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    private int getHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        // 如果子数已经不满足平衡二叉树的条件，直接返回
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = getHeight(root.right);
        if (rightHeight == -1) {
            return -1;
        }
        // 判断左右子树的高度是否相等
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        // 找出左右子树中最大高度
        return Math.max(leftHeight , rightHeight) + 1;
    }
}
