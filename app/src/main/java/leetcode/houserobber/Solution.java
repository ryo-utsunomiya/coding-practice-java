package leetcode.houserobber;

public class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            // ある家iにおける最大利得 dp[i] は以下のうち大きいほう
            // 家iを盗む場合は、 nums[i] + dp[i-2] （一つ前の家は盗めないので、現在の家の金額+2つ前の家までの最大利得）
            // 家iを盗まない場合は、 dp[i-1] （一つ前の家の最大利得を引き継ぐ）
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }

        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.rob(new int[]{1, 2, 3, 1})); // 4
        System.out.println(s.rob(new int[]{2, 7, 9, 3, 1})); // 12
        System.out.println(s.rob(new int[]{2, 1, 1, 2})); // 4
    }
}
