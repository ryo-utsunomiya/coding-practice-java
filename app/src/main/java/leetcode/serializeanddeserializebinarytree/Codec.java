package leetcode.serializeanddeserializebinarytree;

import leetcode.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        var sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    void serialize(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null,");
        } else {
            sb.append(node.val).append(",");
            serialize(node.left, sb);
            serialize(node.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return deserialize(new LinkedList<>(Arrays.asList(data.split(","))));
    }

    TreeNode deserialize(List<String> l) {
        if (l.get(0).equals("null")) {
            l.remove(0);
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(l.get(0)));
        l.remove(0);
        node.left = deserialize(l);
        node.right = deserialize(l);
        return node;
    }

    public static void main(String[] args) {
        var ser = new Codec();
        var deser = new Codec();
        {
            var tree = new TreeNode(1);
            tree.left = new TreeNode(2);
            tree.right = new TreeNode(3);
            tree.right.left = new TreeNode(4);
            tree.right.right = new TreeNode(5);
            var result = deser.deserialize(ser.serialize(tree));
            System.out.println(result);
        }
    }
}
