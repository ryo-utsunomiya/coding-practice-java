package leetcode.findallnumbersdisappearedinanarray;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i]) - 1;
            if (nums[newIndex] > 0) {
                nums[newIndex] *= -1;
            }
        }

        List<Integer> result = new LinkedList<>();
        for (int n = 1; n <= nums.length; n++) {
            if (nums[n - 1] > 0) {
                result.add(n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // [5,6]
        System.out.println(s.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        // [2]
        System.out.println(s.findDisappearedNumbers(new int[]{1,1}));
    }
}
