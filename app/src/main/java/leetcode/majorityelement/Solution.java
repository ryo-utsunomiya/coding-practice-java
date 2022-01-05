package leetcode.majorityelement;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element/
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public static void main(String[] args) {
        var s = new Solution();
        var n = s.majorityElement(new int[]{3,2,3});
        System.out.println(n);
    }
}
