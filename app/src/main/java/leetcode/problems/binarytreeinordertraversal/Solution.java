package leetcode.problems.binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        var visited = new ArrayList<Integer>();
        if (root.left != null) {
            inorderTraversal(root.left, visited);
        }
        visited.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right, visited);
        }

        return visited;
    }

    void inorderTraversal(TreeNode root, List<Integer> visited) {
        if (root.left != null) {
            inorderTraversal(root.left, visited);
        }
        visited.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right, visited);
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        // [1,3,2]
        System.out.println(s.inorderTraversal(
                new TreeNode(1,
                        null,
                        new TreeNode(2, new TreeNode(3), null)
                )
        ));
        // []
        System.out.println(s.inorderTraversal(null));
        // [1]
        System.out.println(s.inorderTraversal(new TreeNode(1)));
    }
}
