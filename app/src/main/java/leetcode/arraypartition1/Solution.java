package leetcode.arraypartition1;

import java.util.Arrays;

public class Solution {
    public int arrayPairSum(int[] nums) {
        // O(n log n)
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // 4
        System.out.println(s.arrayPairSum(new int[]{1, 4, 3, 2}));
        // 9
        System.out.println(s.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
    }
}
