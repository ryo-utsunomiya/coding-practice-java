package udemyalgo.hashtable;

import java.util.HashSet;
import java.util.List;

public class Solution {
    public Pair getPair(List<Integer> numbers, int target) {
        var cache = new HashSet<Integer>();
        for (int num : numbers) {
            int val = target - num;
            if (cache.contains(val)) {
                return new Pair(val, num);
            }
            cache.add(num);
        }

        return null;
    }

    public Pair getPairHalfSum(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(n -> n).sum();
        if (sum % 2 != 0) {
            return null;
        }
        int halfSum = sum / 2;

        var cache = new HashSet<Integer>();
        for (int num : numbers) {
            cache.add(num);
            int val = halfSum - num;
            if (cache.contains(val)) {
                return new Pair(val, num);
            }
        }

        return null;
    }

    static class Pair {
        final int left;
        final int right;

        public Pair(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return String.format("[%d, %d]", left, right);
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.getPair(List.of(11,2,5,9,10,3), 12));
        System.out.println(s.getPairHalfSum(List.of(11,2,5,9,10,3)));
    }
}
