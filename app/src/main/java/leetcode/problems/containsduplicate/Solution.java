package leetcode.problems.containsduplicate;

import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/
class Solution {
    public boolean containsDuplicate(int[] nums) {
        var numSet = new HashSet<Integer>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().containsDuplicate(new int[]{1, 2, 3, 1})); // true
        System.out.println(new Solution().containsDuplicate(new int[]{1, 2, 3, 4})); // false
        System.out.println(new Solution().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // true
    }
}
