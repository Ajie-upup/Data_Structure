package Mode00_LeetCode.class06_二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code01_二叉树的前序遍历 {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return res;
    }

    /**
     * 前序遍历：中 -> 左 -> 右
     * @param root
     */
    private void preOrder(TreeNode root) {
        if (root == null) return;

        res.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
}
