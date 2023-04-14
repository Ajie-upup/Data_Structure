package Mode00_LeetCode.class06_二叉树;

/**
 * @author ajie
 * @date 2023/4/12
 * @description:
 */
public class code12_左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // 左边左叶子节点之和
        int leftValue = sumOfLeftLeaves(root.left);
        // 右边左叶子节点之和
        int rightValue = sumOfLeftLeaves(root.right);
        int leftLeave = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            // 当条件满足时，才为左叶子节点
            leftLeave = root.left.val;
        }
        return leftLeave + leftValue + rightValue;
    }
}
