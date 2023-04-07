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
public class code01_二叉树的层序遍历 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        dfs(1, root);
        return res;
    }

    public void dfs(int index, TreeNode root) {
        // 创建层级对应的集合
        if (res.size() < index) {
            res.add(new ArrayList<Integer>());
        }
        // 给对应的层级添加元素
        res.get(index - 1).add(root.val);

        // 递归添加下一层的元素
        if (root.left != null) {
            dfs(index + 1, root.left);
        }

        if (root.right != null) {
            dfs(index + 1, root.right);
        }
    }


    /**
     * 层次遍历解决
     *
     * @param root
     * @return
     */
    public List<List<Integer>> bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }


}
