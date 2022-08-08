package leetcode.climbingstairs;

public class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climbStairs(0, n, memo);
    }

    private int climbStairs(int i, int n, int[] memo) {
        if (i > n) {
            return 0;
        } else if (i == n) {
            return 1;
        }
        if (memo[i] == 0) {
            memo[i] = climbStairs(i + 1, n, memo) + climbStairs(i + 2, n, memo);
        }
        return memo[i];
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.climbStairs(1)); // 1
        System.out.println(s.climbStairs(2)); // 2
        System.out.println(s.climbStairs(3)); // 3
        /*
         * 1. 1 + 1 + 1 + 1
         * 2. 1 + 1 + 2
         * 3. 1 + 2 + 1
         * 4. 2 + 1 + 1
         * 5. 2 + 2
         */
        System.out.println(s.climbStairs(4)); // 5
        /*
         * 1. 1 + 1 + 1 + 1 + 1
         * 2. 1 + 1 + 1 + 2
         * 3. 1 + 1 + 2 + 1
         * 4. 1 + 2 + 1 + 1
         * 5. 2 + 1 + 1 + 1
         * 6. 1 + 2 + 2
         * 7. 2 + 1 + 2
         * 8. 2 + 2 + 1
         */
        System.out.println(s.climbStairs(5)); // 8
        System.out.println(s.climbStairs(45)); // 8
    }
}
