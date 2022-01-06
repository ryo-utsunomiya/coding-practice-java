package leetcode.binarytreeinordertraversal;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        var visited = new ArrayList<Integer>();
        inorderTraversal(root, visited);
        return visited;
    }

    void inorderTraversal(TreeNode node, List<Integer> visited) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            inorderTraversal(node.left, visited);
        }
        visited.add(node.val);
        if (node.right != null) {
            inorderTraversal(node.right, visited);
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
