package leetcode.constructbinarytreefrompreorderandinordertraversal;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int[] preorder;
    private int preorderIndex;
    private final Map<Integer, Integer> inorderIndexMap = new HashMap<>();

    public TreeNode buildTree(final int[] preorder, final int[] inorder) {
        this.preorder = preorder;
        this.preorderIndex = 0;

        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }

        return buildTree(0, inorder.length - 1);
    }

    public TreeNode buildTree(final int inLeft, final int inRight) {
        if (inLeft > inRight) {
            return null;
        }

        final int val = preorder[preorderIndex];
        preorderIndex++;
        final int inorderIndex = inorderIndexMap.get(val);
        final var node = new TreeNode(val);
        node.left = buildTree(inLeft, inorderIndex - 1);
        node.right = buildTree(inorderIndex + 1, inRight);
        return node;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.buildTree(
                new int[]{3,9,20,15,7},
                new int[]{9,3,15,20,7}
        ));
        System.out.println(s.buildTree(
                new int[]{-1},
                new int[]{-1}
        ));
    }
}
