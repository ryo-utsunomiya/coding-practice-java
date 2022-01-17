package leetcode.maximumdepthofbinarytree;

import leetcode.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        var s = new Solution();
        var t1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)
                )
        );
        System.out.println(s.maxDepth(t1)); // 3
        var t2 = new TreeNode(1,
                null,
                new TreeNode(2)
        );
        System.out.println(s.maxDepth(t2)); // 2
        var t3 = new TreeNode(1);
        System.out.println(s.maxDepth(t3)); // 1
    }
}
