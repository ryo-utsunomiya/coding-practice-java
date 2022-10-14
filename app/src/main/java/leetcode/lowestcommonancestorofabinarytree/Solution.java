package leetcode.lowestcommonancestorofabinarytree;

import leetcode.TreeNode;

public class Solution {
    TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.ans = null;
        recurseTree(root, p, q);
        return this.ans;
    }

    boolean recurseTree(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return false;
        }

        int left = recurseTree(node.left, p, q) ? 1 : 0;
        int right = recurseTree(node.right, p, q) ? 1 : 0;
        int mid = (node == p || node == q) ? 1 : 0;

        if (left + right + mid >= 2) {
            this.ans = node;
            return true;
        }

        return (left + right + mid) >= 1;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var root = new TreeNode(3);
            root.left = new TreeNode(5);
            root.left.left = new TreeNode(6);
            root.left.right = new TreeNode(2);
            root.left.right.left = new TreeNode(7);
            root.left.right.right = new TreeNode(4);
            root.right = new TreeNode(1);
            root.right.left = new TreeNode(0);
            root.right.right = new TreeNode(8);
            System.out.println(s.lowestCommonAncestor(root, root.left, root.right).val); // 3
            System.out.println(s.lowestCommonAncestor(root, root.left, root.left.right.right).val); // 5
        }
        {
            var root = new TreeNode(1);
            root.left = new TreeNode(2);
            System.out.println(s.lowestCommonAncestor(root, root, root.left).val); // 1
        }
    }
}
