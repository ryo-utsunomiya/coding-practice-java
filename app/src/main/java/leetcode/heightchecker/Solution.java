package leetcode.heightchecker;

import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);
        Arrays.sort(expected);

        int answer = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.heightChecker(new int[]{1,1,4,2,1,3})); // 3
        System.out.println(s.heightChecker(new int[]{5,1,2,3,4})); // 5
        System.out.println(s.heightChecker(new int[]{1,2,3,4,5})); // 0
    }
}
