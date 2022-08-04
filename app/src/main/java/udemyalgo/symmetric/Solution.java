package udemyalgo.symmetric;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    List<Pair> findSymmetricPairs(List<Pair> pairs) {
        var result = new ArrayList<Pair>();

        var seen = new HashSet<String>();
        for (var p : pairs) {
            if (seen.contains(p.reverse().key())) {
                result.add(p);
            } else {
                seen.add(p.key());
            }
        }

        return result;
    }

    static class Pair {
        int left;
        int right;
        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }
        public Pair reverse() {
            return new Pair(right, left);
        }
        public String key() {
            return String.format("left=%d,right=%d", left, right);
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var result = s.findSymmetricPairs(List.of(
                    new Pair(1,2),
                    new Pair(3,5),
                    new Pair(4,7),
                    new Pair(5,3),
                    new Pair(7,4)
            ));
            for (var p : result) {
                System.out.printf("[%d,%d]\n", p.left, p.right);
            }
        }
    }
}
