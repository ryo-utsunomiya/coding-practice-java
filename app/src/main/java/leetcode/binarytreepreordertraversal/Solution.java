package leetcode.binarytreepreordertraversal;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-preorder-traversal/
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        var visited = new ArrayList<Integer>();
        preorderTraversal(root, visited);
        return visited;
    }

    void preorderTraversal(TreeNode node, List<Integer> visited) {
        if (node == null) {
            return;
        }
        visited.add(node.val);
        if (node.left != null) {
            preorderTraversal(node.left, visited);
        }
        if (node.right != null) {
            preorderTraversal(node.right, visited);
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
        System.out.println(s.preorderTraversal(null));
        // [1]
        System.out.println(s.preorderTraversal(new TreeNode(1)));
    }
}
