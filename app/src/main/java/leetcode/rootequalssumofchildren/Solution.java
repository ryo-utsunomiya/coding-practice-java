package leetcode.rootequalssumofchildren;

import leetcode.TreeNode;

public class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var root = new TreeNode(10);
            var left = new TreeNode(4);
            var right = new TreeNode(6);
            root.left = left;
            root.right = right;
            System.out.println(s.checkTree(root));
        }
        {
            var root = new TreeNode(5);
            var left = new TreeNode(3);
            var right = new TreeNode(1);
            root.left = left;
            root.right = right;
            System.out.println(s.checkTree(root));
        }
    }
}
