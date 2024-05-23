package leetcode.clonegraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public Node cloneGraph(Node root) {
        return clone(root, new HashMap<>());
    }

    Node clone(Node node, Map<Node, Node> origToClone) {
        if (node == null) {
            return null;
        }

        var clone = origToClone.get(node);
        if (clone == null) {
            clone = new Node(node.val);
            origToClone.put(node, clone);
            for (var neighbor : node.neighbors) {
                clone.neighbors.add(clone(neighbor, origToClone));
            }
        }
        return clone;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var node1 = new Node(1);
            var node2 = new Node(2);
            var node3 = new Node(3);
            var node4 = new Node(4);
            node1.neighbors = List.of(node2, node4);
            node2.neighbors = List.of(node1, node3);
            node3.neighbors = List.of(node2, node4);
            node4.neighbors = List.of(node1, node3);
            var clone = s.cloneGraph(node1);
            System.out.println(clone);
        }
    }

    public static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
