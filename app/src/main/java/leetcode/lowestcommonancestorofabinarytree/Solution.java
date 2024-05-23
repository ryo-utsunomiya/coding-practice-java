package leetcode.lowestcommonancestorofabinarytree;

import leetcode.TreeNode;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
        // Base case
        if (node == null || node == p || node == q) {
            return node;
        }

        // Recursively find LCA in the left and right subtrees
        TreeNode left = lowestCommonAncestor(node.left, p, q);
        TreeNode right = lowestCommonAncestor(node.right, p, q);

        // If both left and right are non-null, current node is LCA
        if (left != null && right != null) {
            return node;
        }

        // If either left or right is non-null, return the non-null value
        return left != null ? left : right;
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
