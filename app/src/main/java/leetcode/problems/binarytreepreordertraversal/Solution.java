package leetcode.problems.binarytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-preorder-traversal/
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null || root.val == 0) {
            return List.of();
        }
        var visited = new ArrayList<Integer>();
        visited.add(root.val);
        if (root.left != null) {
            preorderTraversal(root.left, visited);
        }
        if (root.right != null) {
            preorderTraversal(root.right, visited);
        }

        return visited;
    }

    public void preorderTraversal(TreeNode root, List<Integer> visited) {
        if (root == null || root.val == 0) {
            return;
        }
        visited.add(root.val);
        if (root.left != null) {
            preorderTraversal(root.left, visited);
        }
        if (root.right != null) {
            preorderTraversal(root.right, visited);
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        // [1,2,3]
        System.out.println(s.preorderTraversal(
                new TreeNode(1,
                        null,
                        new TreeNode(2, new TreeNode(3), null)
                )
        ));
        // []
        System.out.println(s.preorderTraversal(new TreeNode()));
        // [1]
        System.out.println(s.preorderTraversal(new TreeNode(1)));
    }
}
