package Mode00_LeetCode.class06_二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code02_二叉树的中序遍历 {
    private List<Integer> res = new ArrayList<>();

    public  List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }

    /**
     * 中序遍历：左 -> 中 -> 右
     */
    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}
