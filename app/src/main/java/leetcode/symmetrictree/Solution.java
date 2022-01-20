package leetcode.symmetrictree;

import leetcode.TreeNode;

// https://leetcode.com/problems/symmetric-tree/
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        } else if (t1 == null || t2 == null) {
            return false;
        } else if (t1.val != t2.val) {
            return false;
        }
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {
        var s = new Solution();

        var t1 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(3)
                )
        );
        System.out.println(s.isSymmetric(t1));

        var t2 = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(3)
                ),
                new TreeNode(2,
                        null,
                        new TreeNode(3)
                )
        );
        System.out.println(s.isSymmetric(t2));

        var t3 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );
        System.out.println(s.isSymmetric(t3));
    }
}
