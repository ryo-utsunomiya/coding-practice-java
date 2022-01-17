package leetcode.maxconsectiveones;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        return Math.max(count, maxCount);
    }

    public static void main(String[] args) {
        var s = new Solution();
        // 3
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
        // 2
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
        // 1
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1}));
        // 0
        System.out.println(s.findMaxConsecutiveOnes(new int[]{0}));
    }
}
