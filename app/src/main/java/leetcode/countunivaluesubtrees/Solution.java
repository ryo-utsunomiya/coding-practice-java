package leetcode.countunivaluesubtrees;

import leetcode.TreeNode;

public class Solution {
    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return countUniValTree(root, 0);
    }

    int countUniValTree(TreeNode tree, int count) {
        if (isUniValTree(tree, tree.val)) {
            count++;
        }
        if (tree.left != null) {
            count = countUniValTree(tree.left, count);
        }
        if (tree.right != null) {
            count = countUniValTree(tree.right, count);
        }
        return count;
    }

    boolean isUniValTree(TreeNode tree, int value) {
        if (tree == null) {
            return false;
        }
        if (tree.val != value) {
            return false;
        }
        if (tree.left != null && !isUniValTree(tree.left, value)) {
            return false;
        }
        if (tree.right != null && !isUniValTree(tree.right, value)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var root = new TreeNode(5);
            root.left = new TreeNode(1);
            root.left.left = new TreeNode(5);
            root.left.right = new TreeNode(5);
            root.right = new TreeNode(5);
            root.right.right = new TreeNode(5);
            System.out.println(s.countUnivalSubtrees(root)); // 4
        }
        {
            System.out.println(s.countUnivalSubtrees(null)); // 0
        }
        {
            var root = new TreeNode(5);
            root.left = new TreeNode(5);
            root.left.left = new TreeNode(5);
            root.left.right = new TreeNode(5);
            root.right = new TreeNode(5);
            root.right.right = new TreeNode(5);
            System.out.println(s.countUnivalSubtrees(root)); // 6
        }
    }
}
