package leetcode.contansduplicate2;

import java.util.HashSet;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        var set = new HashSet<Integer>(); // sliding window
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) { // distance is too far
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)); // true
        System.out.println(s.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)); // true
        System.out.println(s.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // false
    }
}
