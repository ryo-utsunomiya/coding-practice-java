package leetcode.invertbinarytree;

import leetcode.TreeNode;

// https://leetcode.com/problems/invert-binary-tree/
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode right = invertTree(root.left);
        TreeNode left = invertTree(root.right);
        root.left = right;
        root.right = left;

        return root;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var root = new TreeNode(4);
            var a = new TreeNode(2);
            root.left = a;
            var b = new TreeNode(7);
            root.right = b;
            var c = new TreeNode(1);
            a.left = c;
            var d = new TreeNode(3);
            a.right = d;
            var e = new TreeNode(6);
            b.left = e;
            var f = new TreeNode(9);
            b.right = f;
            System.out.println(s.invertTree(root));
        }
        {
            var root = new TreeNode(2);
            root.left = new TreeNode(1);
            root.right = new TreeNode(3);
            System.out.println(s.invertTree(root));
        }
        {
            System.out.println(s.invertTree(null));
        }
    }
}
