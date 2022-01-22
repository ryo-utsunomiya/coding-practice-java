package leetcode.lowestcommonancestorofabinarysearchtree;

import leetcode.TreeNode;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return root;
    }

    public static void main(String[] args) {
        var s = new Solution();
        var t4 = new TreeNode(4, new TreeNode(3), new TreeNode(5));
        var t2 = new TreeNode(2,
                new TreeNode(0),
                t4);
        var t8 = new TreeNode(8, new TreeNode(7), new TreeNode(9));
        var t6 = new TreeNode(6, t2, t8);
        var result = s.lowestCommonAncestor(t6, t2, t8);
        System.out.println(result.val);

        var t2_1 = new TreeNode(1);
        var t2_2 = new TreeNode(2, t2_1, null);
        System.out.println(s.lowestCommonAncestor(t2_2, t2_2, t2_1).val);

        // [5,3,6,2,4,null,null,1], 1, 4 -> 3
        System.out.println(s.lowestCommonAncestor(s.tree3(), new TreeNode(1), new TreeNode(4)).val);
    }

    TreeNode tree3() {
        var root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = null;
        root.right.right = null;
        root.left.left.left = new TreeNode(1);
        return root;
    }
}
