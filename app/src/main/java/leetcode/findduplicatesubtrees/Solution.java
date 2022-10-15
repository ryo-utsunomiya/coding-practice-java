package leetcode.findduplicatesubtrees;

import leetcode.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    int curId;
    Map<String, Integer> serialToId;
    Map<Integer, Integer> idToCount;
    List<TreeNode> answer;

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        this.curId = 1;
        this.serialToId = new HashMap<>();
        this.idToCount = new HashMap<>();
        this.answer = new LinkedList<>();
        postorder(root);
        return this.answer;
    }

    int postorder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftId = postorder(root.left);
        int rightId = postorder(root.right);
        String curSerial = leftId + "," + root.val + "," + rightId;
        int serialId = serialToId.getOrDefault(curSerial, curId);
        if (serialId == curId) {
            curId++;
        }
        serialToId.put(curSerial, serialId);
        idToCount.put(serialId, idToCount.getOrDefault(serialId, 0) + 1);
        if (idToCount.get(serialId) == 2) {
            this.answer.add(root);
        }
        return serialId;
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
