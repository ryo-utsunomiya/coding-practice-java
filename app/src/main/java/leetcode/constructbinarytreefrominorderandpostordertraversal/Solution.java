package leetcode.constructbinarytreefrominorderandpostordertraversal;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<Integer, Integer> inorderIndexMap = new HashMap<>();
    private int[] postorder;
    private int postorderIndex;

    /**
     * inorder: 木のノードを左の子、親、右の子の順に訪問する順序
     * postorder: 木のノードを左の子、右の子、親の順に訪問する順序
     *
     * postorder の最後の要素が根(root)なので、ここから再帰的に木を構築する
     * inorder を使うと左右を識別できる
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // inorder から値を探しやすくするため、値 -> インデックス のMapを作る
        for (int i = 0; i < inorder.length; i++) {
            this.inorderIndexMap.put(inorder[i], i);
        }
        this.postorder = postorder;
        this.postorderIndex = postorder.length - 1; // root から木を構築する

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

        // ノードの左右の木を再帰的に構築
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
