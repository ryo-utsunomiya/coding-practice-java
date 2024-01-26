package leetcode.longestincreasingsubsequence;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int longest = 1;

        // cur = 0, dp = [1,1,1,1,1,1], prev = []
        // cur = 1, dp = [1,2,1,1,1,1], prev = [0]
        // cur = 0, dp = [1,2,1,1,1,1], prev = [0,1]
        // cur = 3, dp = [1,2,1,3,1,1], prev = [0,1,0]
        // cur = 2, dp = [1,2,1,3,3,1], prev = [0,1,0,3]
        // cur = 3, dp = [1,2,1,3,3,4], prev = [0,1,0,3,2]
        for (int i = 0; i < nums.length; i++) {
            // 各要素について、それより前の小さい要素を探し、
            // その要素で終わる最長増加部分列に現在の要素を加えたものが、
            // 現在の要素で終わる最長部分列となる
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            longest = Math.max(longest, dp[i]);
        }

        return longest;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18})); // 4
        System.out.println(s.lengthOfLIS(new int[]{0,1,0,3,2,3})); // 4
        System.out.println(s.lengthOfLIS(new int[]{7,7,7,7,7,7,7})); // 1
    }
}
