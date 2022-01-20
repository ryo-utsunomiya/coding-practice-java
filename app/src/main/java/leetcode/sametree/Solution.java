package leetcode.sametree;

import leetcode.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))
        ));
        System.out.println(s.isSameTree(
                new TreeNode(1, new TreeNode(2), null),
                new TreeNode(1, null, new TreeNode(2))
        ));
        System.out.println(s.isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(1)),
                new TreeNode(1, new TreeNode(1), new TreeNode(2))
        ));
    }
}
