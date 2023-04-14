package Mode00_LeetCode.class06_二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/12
 * @description:
 */
public class code11_二叉树的所有路径 {
    private List<String> res = new ArrayList<>();

    // 存放节点中的路径
    private List<Integer> paths = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return res;
        }
        traversal(root);
        return res;
    }

    private void traversal(TreeNode root) {
        paths.add(root.val);
        if (root.left == null && root.right == null) {
            // 找到叶子节点，将元素添加到结果集合中
            addString();
            return;
        }
        if (root.left != null) {
            traversal(root.left);
            // 回溯
            paths.remove(paths.size() - 1);
        }
        if (root.right != null) {
            traversal(root.right);
            // 回溯
            paths.remove(paths.size() - 1);
        }

    }

    private void addString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < paths.size(); i++) {
            sb.append(paths.get(i));
            if (i < paths.size() - 1) {
                sb.append("->");
            }
        }
        res.add(sb.toString());
    }

}
