package leetcode.binarytreepostordertraversal;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        var visited = new ArrayList<Integer>();
        postorderTraversal(root, visited);
        return visited;
    }

    void postorderTraversal(TreeNode node, List<Integer> visited) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            postorderTraversal(node.left, visited);
        }
        if (node.right != null) {
            postorderTraversal(node.right, visited);
        }
        visited.add(node.val);
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.postorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null))));
    }
}
