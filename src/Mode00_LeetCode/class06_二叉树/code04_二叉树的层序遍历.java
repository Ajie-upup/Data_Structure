package Mode00_LeetCode.class06_二叉树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author ajie
 * @date 2023/4/11
 * @description:
 */
public class code04_二叉树的层序遍历 {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        // 借助队列实现二叉树的层序遍历
        Deque<TreeNode> nodeDeque = new LinkedList<>();
        if (root != null) {
            nodeDeque.offer(root);
        }
        while (!nodeDeque.isEmpty()) {
            int size = nodeDeque.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodeDeque.pollFirst();
                list.add(node.val);
                if (node.left != null) {
                    nodeDeque.add(node.left);
                }
                if (node.right != null) {
                    nodeDeque.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
