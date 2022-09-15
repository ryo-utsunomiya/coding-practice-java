package leetcode.houserobber;

public class Solution {
    public int rob(int[] nums) {
        int N = nums.length;

        int[] maxRobbedAmount = new int[nums.length + 1];
        maxRobbedAmount[N] = 0;
        maxRobbedAmount[N - 1] = nums[N - 1];

        for (int i = N - 2; i >= 0; i--) {
            maxRobbedAmount[i] = Math.max(
                    maxRobbedAmount[i + 1],
                    maxRobbedAmount[i + 2] + nums[i]
            );
        }

        return maxRobbedAmount[0];
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.rob(new int[]{1, 2, 3, 1})); // 4
        System.out.println(s.rob(new int[]{2, 7, 9, 3, 1})); // 12
        System.out.println(s.rob(new int[]{2, 1, 1, 2})); // 4
    }
}
