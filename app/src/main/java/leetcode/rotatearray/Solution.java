package leetcode.rotatearray;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        var result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        var s = new Solution();
        var nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        s.rotate(nums, 3);
        // [5,6,7,1,2,3,4]
        System.out.println(Arrays.toString(nums));

        var nums2 = new int[]{-1, -100, 3, 99};
        s.rotate(nums2, 2);
        // [3,99,-1,-100]
        System.out.println(Arrays.toString(nums2));

        var nums3 = new int[]{1, 2};
        s.rotate(nums3, 101);
        System.out.println(Arrays.toString(nums3));
    }
}
