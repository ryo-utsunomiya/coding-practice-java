package leetcode.removeduplicatesfromsortedarray;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        var s = new Solution();
//        var nums = new int[]{1,1,2};
//        int k = s.removeDuplicates(nums);
//        System.out.println(k); // 2
//        System.out.println(Arrays.toString(nums)); // [1,2,_]
        var nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = s.removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums)); // [0,1,2,3,4,_,_,_,_,_]
    }
}
