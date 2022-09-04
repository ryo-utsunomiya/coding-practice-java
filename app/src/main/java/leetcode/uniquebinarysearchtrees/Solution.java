package leetcode.uniquebinarysearchtrees;

public class Solution {
    int[] memo;

    public int numTrees(int n) {
        memo = new int[n+1];
        return numTrees(1, n);
    }

    public int numTrees(int start, int end) {
        if (start >= end) {
            return 1;
        }
        int diff = end - start;
        if (memo[diff] != 0) {
            return memo[diff];
        }

        int numTrees = 0;
        for (int root = start; root <= end; root++) {
            int numLeftTrees = numTrees(start, root - 1);
            int numRightTrees = numTrees(root + 1, end);
            numTrees += numLeftTrees * numRightTrees;
        }
        memo[diff] = numTrees;
        return numTrees;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.numTrees(1)); // 1
        System.out.println(s.numTrees(2)); // 2
        System.out.println(s.numTrees(3)); // 5
        System.out.println(s.numTrees(19)); // 1767263190
    }
}
