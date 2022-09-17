package leetcode.longestincreasingsubsequence;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, 1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int longest = 0;
        for (int c : dp) {
            longest = Math.max(longest, c);
        }
        return longest;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // 4
        System.out.println(s.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
