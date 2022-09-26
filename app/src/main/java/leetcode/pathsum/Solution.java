package leetcode.pathsum;

import leetcode.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        targetSum -= root.val;

        if (root.left == null && root.right == null) { // leaf node
            return targetSum == 0;
        }
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var root = new TreeNode(5);
            root.left = new TreeNode(4);
            root.left.left = new TreeNode(11);
            root.left.left.left = new TreeNode(7);
            root.left.left.right = new TreeNode(2);
            root.right = new TreeNode(8);
            root.right.left = new TreeNode(13);
            root.right.right = new TreeNode(4);
            root.right.right.right = new TreeNode(1);
            System.out.println(s.hasPathSum(root, 22)); // true
        }
        {
            var tree = new TreeNode(1);
            tree.left = new TreeNode(2);
            tree.right = new TreeNode(3);
            System.out.println(s.hasPathSum(tree, 3)); // true
            System.out.println(s.hasPathSum(tree, 4)); // true
            System.out.println(s.hasPathSum(tree, 5)); // false
        }
        {
            System.out.println(s.hasPathSum(null, 1)); // false
            System.out.println(s.hasPathSum(new TreeNode(1), 1)); // true
        }
    }
}
