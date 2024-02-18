package leetcode.uniquebinarysearchtrees;

public class Solution {

    public int numTrees(int n) {
        // 1からiまでの数字を使って作ることができるBSTの数
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // 1からiまでの各jを根とした時のBSTの数を計算る
            int numTrees = 0;
            for (int j = 1; j <= i; j++) {
                // BSTの左側はj-1個のノードから成り、右側はi-j個のノードから成る
                numTrees += dp[j-1] * dp[i-j];
            }
            dp[i] = numTrees;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.numTrees(1)); // 1
        System.out.println(s.numTrees(2)); // 2
        System.out.println(s.numTrees(3)); // 5
        System.out.println(s.numTrees(19)); // 1767263190
    }
}
