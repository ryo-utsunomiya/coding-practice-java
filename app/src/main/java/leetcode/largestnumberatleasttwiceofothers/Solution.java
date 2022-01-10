package leetcode.largestnumberatleasttwiceofothers;

public class Solution {
    public int dominantIndex(int[] nums) {
        int largest = 0;
        int secondLargest = 0;
        int largestNumberIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n > largest) {
                secondLargest = largest;
                largest = n;
                largestNumberIndex = i;
            } else if (n > secondLargest) {
                secondLargest = n;
            }
        }

        if (largest >= secondLargest * 2) {
            return largestNumberIndex;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();

        // 1
        System.out.println(s.dominantIndex(new int[]{3, 6, 1, 0}));
        // -1
        System.out.println(s.dominantIndex(new int[]{1, 2, 3, 4}));
        // 0
        System.out.println(s.dominantIndex(new int[]{1}));
        // -1
        System.out.println(s.dominantIndex(new int[]{0, 0, 3, 2}));
    }
}
