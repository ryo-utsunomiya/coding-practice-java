package leetcode.maximumsubarray;

// https://leetcode.com/problems/maximum-subarray/
public class Solution {
    public int maxSubArray(int[] nums) {
        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            current = Math.max(num, current + num);
            max = Math.max(max, current);
        }

        return max;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4})); // 6
        System.out.println(s.maxSubArray(new int[]{1})); // 1
        System.out.println(s.maxSubArray(new int[]{5, 4, -1, 7, 8})); // 23
        System.out.println(s.maxSubArray(new int[]{0, -1, -2})); // 0
        System.out.println(s.maxSubArray(new int[]{-1})); // -1
        System.out.println(s.maxSubArray(new int[]{-1, -2})); // -1
    }
}
