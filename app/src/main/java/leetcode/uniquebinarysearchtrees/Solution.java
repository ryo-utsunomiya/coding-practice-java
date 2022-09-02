package leetcode.uniquebinarysearchtrees;

public class Solution {
    int[] memo;

    public int numTrees(int n) {
        memo = new int[n+1];
        return numTrees(1, n);
    }

    public int numTrees(int left, int right) {
        if (left >= right) {
            return 1;
        }
        if (memo[right - left] != 0) {
            return memo[right - left];
        }

        int numTrees = 0;
        for (int root = left; root <= right; root++) {
            int numLeftTrees = numTrees(left, root - 1);
            int numRightTrees = numTrees(root + 1, right);
            numTrees += numLeftTrees * numRightTrees;
        }
        memo[right - left] = numTrees;
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
