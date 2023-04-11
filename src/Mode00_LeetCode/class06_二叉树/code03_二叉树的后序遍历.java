package Mode00_LeetCode.class06_二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code03_二叉树的后序遍历 {
    private List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return res;
    }

    /**
     * 后序遍历：左 -> 右 -> 中
     */
    private void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        res.add(root.val);
    }
}
