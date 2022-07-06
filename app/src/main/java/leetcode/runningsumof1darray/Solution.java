package leetcode.runningsumof1darray;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            runningSum[i] = sum;
        }

        return runningSum;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(Arrays.toString(s.runningSum(new int[]{1, 2, 3, 4})));
    }
}
