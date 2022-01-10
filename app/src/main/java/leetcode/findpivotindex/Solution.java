package leetcode.findpivotindex;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        var s = new Solution();

        // 3
        System.out.println(s.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        // -1
        System.out.println(s.pivotIndex(new int[]{1, 2, 3}));
        // 0
        System.out.println(s.pivotIndex(new int[]{2, 1, -1}));
    }
}
