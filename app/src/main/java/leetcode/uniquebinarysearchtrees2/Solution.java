package leetcode.uniquebinarysearchtrees2;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int left, int right) {
        var trees = new LinkedList<TreeNode>();
        if (left > right) {
            trees.add(null);
            return trees;
        } else if (left == right) {
            trees.add(new TreeNode(left));
            return trees;
        }

        for (int root = left; root <= right; root++) {
            List<TreeNode> leftTrees = generateTrees(left, root - 1);
            List<TreeNode> rightTrees = generateTrees(root + 1, right);

            for (var l : leftTrees) {
                for (var r : rightTrees) {
                    var rootNode = new TreeNode(root);
                    rootNode.left = l;
                    rootNode.right = r;
                    trees.add(rootNode);
                }
            }
        }
        return trees;
    }

    public static void main(String[] args) {
        var s = new Solution();
//        System.out.println(s.generateTrees(1));
//        System.out.println(s.generateTrees(2));
        System.out.println(s.generateTrees(3));
    }
}
