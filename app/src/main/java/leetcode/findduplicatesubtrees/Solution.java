package leetcode.findduplicatesubtrees;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<String, Integer> serialToCount;
    List<TreeNode> answer;

    /**
     * 二分木をトラバースしながら各サブツリーの構造をシリアライズし、
     * そのシリアライズされた文字列を使ってサブツリーが以前に出現したかどうかを判断する
     * @param root 根
     * @return 重複した部分木
     */
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        this.serialToCount = new HashMap<>();
        this.answer = new LinkedList<>();
        collect(root);
        return this.answer;
    }

    /**
     * @param node トラバース対象のノード
     * @return ノードの木構造をシリアライズした文字列
     */
    String collect(TreeNode node) {
        if (node == null) {
            return "#";
        }
        String serial = node.val + "," + collect(node.left) + "," + collect(node.right);
        serialToCount.put(serial, serialToCount.getOrDefault(serial, 0) + 1);
        if (serialToCount.get(serial) == 2) {
            this.answer.add(node);
        }
        return serial;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), null),
                new TreeNode(3,
                        new TreeNode(2, new TreeNode(4), null),
                        new TreeNode(4)
                )
            );
            // [2,4], [4]
            System.out.println(s.findDuplicateSubtrees(root));
        }
//        {
//            var root = new TreeNode(2, new TreeNode(1), new TreeNode(1));
//            // [1]
//            System.out.println(s.findDuplicateSubtrees(root));
//        }
//        {
//            var root = new TreeNode(2,
//                    new TreeNode(2, new TreeNode(3), null),
//                    new TreeNode(2, new TreeNode(3), null)
//            );
//            // [2,3], [3]
//            System.out.println(s.findDuplicateSubtrees(root));
//        }
//        {
//            var root = new TreeNode(0,
//                    new TreeNode(0, new TreeNode(0), null),
//                    new TreeNode(0,
//                            null,
//                            new TreeNode(
//                                0,
//                                null,
//                                new TreeNode(0)
//                        )
//                    )
//            );
            // [0]
//            System.out.println(s.findDuplicateSubtrees(root));
//        }
    }
}
