package leetcode.binarytreelevelordertraversal;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.peek();
                assert curr != null;
                numbers.add(curr.val);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
                queue.poll();
            }
            result.add(numbers);
        }

        return result;
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

        // [[1],[2,3],[4,5]]
        System.out.println(s.levelOrder(
                new TreeNode(
                        1,
                        new TreeNode(2, new TreeNode(4), null),
                        new TreeNode(3, null, new TreeNode(5))
                )
        ));
    }
}
