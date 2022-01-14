package leetcode.searchinabinarysearchtree;

import leetcode.TreeNode;

public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            return root;
        } else if (root.val > val && root.left != null) {
            return searchBST(root.left, val);
        } else if (root.val < val && root.right != null) {
            return searchBST(root.right, val);
        }
        return null;
    }

    public static void main(String[] args) {
        var s = new Solution();
        var tree = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(7)
        );
        TreeNode result = s.searchBST(tree, 5);
        if (result != null) {
            System.out.println(result.val);
        } else {
            System.out.println("null");
        }
    }
}
