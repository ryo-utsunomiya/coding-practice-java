package leetcode.minimumsizsubarraysum;

public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;
        int slow = 0;
        int fast = 0;
        int sum = 0;
        while (fast < nums.length) {
            sum += nums[fast];
            while (sum >= target) {
                answer = Math.min(answer, fast + 1 - slow);
                sum -= nums[slow++];
            }
            fast++;
        }
        return (answer != Integer.MAX_VALUE) ? answer : 0;
    }

    public static void main(String[] args) {
        var s = new Solution();
        // 2
        System.out.println(s.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        // 1
        System.out.println(s.minSubArrayLen(4, new int[]{1, 4, 4}));
        // 0
        System.out.println(s.minSubArrayLen(11, new int[]{1, 1, 1, 1, 1, 1, 1, 1}));
    }
}
