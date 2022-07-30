package leetcode.maxconsecutiveones2;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevCount = Integer.MIN_VALUE;
        int currentCount = 0;
        int maxCount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, prevCount + 1 + currentCount);
                prevCount = currentCount;
                currentCount = 0;
            }
        }
        if (prevCount != Integer.MIN_VALUE) {
            maxCount = Math.max(maxCount, prevCount + 1 + currentCount);
        } else {
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }


    public static void main(String[] args) {
        var s = new Solution();
        // 4
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1,0,1,1,0}));
        // 4
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));

        // 4
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1,1,0,1}));
        // 1
        System.out.println(s.findMaxConsecutiveOnes(new int[]{1}));
        // 1
        System.out.println(s.findMaxConsecutiveOnes(new int[]{0}));
        // 2
        System.out.println(s.findMaxConsecutiveOnes(new int[]{0,1}));
    }
}
