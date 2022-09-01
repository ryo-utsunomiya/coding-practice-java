package udemyalgo.maxsubarray;

import java.util.Arrays;

// max sub array sum
// in: [1, -2, 3, 6, -1, 2, 4, -5, 2]
// max: 14 [3,6,-1,2,4]
//
// max circular sub array sum
// in: [1, -2, 3, 6, -1, 2, 4, -5, 2]
// max: 15 [1,-2,3,6,-1,2,4] + [2]
public class Solution {
    public int maxSubArraySum(int[] nums) {
        int currentSubArraySum = nums[0];
        int maxSubArraySum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            // when currentSubArraySum + num is smaller than num, discard currentSubArray
            currentSubArraySum = Math.max(num, currentSubArraySum + num);
            maxSubArraySum = Math.max(maxSubArraySum, currentSubArraySum);
        }

        return maxSubArraySum;
    }

    public int maxCircularSubArraySum(int[] nums) {
        int sumArray = 0;
        for (int j : nums) {
            sumArray += j;
        }

        int currentSubArraySum = nums[0];
        int minSubArraySum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            currentSubArraySum = Math.min(num, currentSubArraySum + num);
            minSubArraySum = Math.min(minSubArraySum, currentSubArraySum);
        }

        return sumArray - minSubArraySum;
    }

    public static void main(String[] args) {
        var s = new Solution();
        int[] a = new int[]{1, -2, 3, 6, -1, 2, 4, -5, 2};
        System.out.println(s.maxSubArraySum(a));
        System.out.println(s.maxCircularSubArraySum(a));
    }
}
