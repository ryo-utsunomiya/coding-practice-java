package leetcode.maximumdepthofbinarytree;

import leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        Deque<Integer> depths = new ArrayDeque<>();
        depths.push(1);

        int maxDepth = 0;
        int currentDepth;
        TreeNode current;
        while (!stack.isEmpty()) {
            current = stack.pop();
            currentDepth = depths.pop();
            maxDepth = Math.max(maxDepth, currentDepth);
            if (current.left != null) {
                stack.push(current.left);
                depths.push(currentDepth + 1);
            }
            if (current.right != null) {
                stack.push(current.right);
                depths.push(currentDepth + 1);
            }
        }

        return maxDepth;
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
