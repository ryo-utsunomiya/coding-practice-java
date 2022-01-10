package leetcode.binarytreelevelordertraversal;

import leetcode.TreeNode;

import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        return List.of();
    }

    public static void main(String[] args) {
        var s = new Solution();

        // [[3],[9,20],[15,7]]
        System.out.println(s.levelOrder(
                new TreeNode(
                        3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7)
                        )
                )
        ));

        // [[1]]
        System.out.println(s.levelOrder(new TreeNode(1)));

        // []
        System.out.println(s.levelOrder(null));
    }
}
