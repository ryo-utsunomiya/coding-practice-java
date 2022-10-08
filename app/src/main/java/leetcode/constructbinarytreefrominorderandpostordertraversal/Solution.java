package leetcode.constructbinarytreefrominorderandpostordertraversal;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    private int[] postorder;
    private int postorderIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            this.inorderIndexMap.put(inorder[i], i);
        }
        this.postorder = postorder;
        this.postorderIndex = postorder.length - 1;

        return buildTree(0, inorder.length - 1);
    }

    TreeNode buildTree(int inorderLeft, int inorderRight) {
        if (inorderLeft > inorderRight) {
            return null;
        }

        int value = postorder[postorderIndex];
        postorderIndex--;
        var node = new TreeNode(value);
        int inorderIndex = inorderIndexMap.get(value);

        node.right = buildTree(inorderIndex + 1, inorderRight);
        node.left = buildTree(inorderLeft, inorderIndex - 1);

        return node;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.buildTree(
                new int[]{9,3,15,20,7},
                new int[]{9,15,7,20,3}
        ));
        System.out.println(s.buildTree(
                new int[]{-1},
                new int[]{-1}
        ));
    }
}
