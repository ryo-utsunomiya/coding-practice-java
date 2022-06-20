package leetcode.happynumber;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
        int sum = n;
        var seen = new HashSet<Integer>();
        while (sum != 1 && !seen.contains(sum)) {
            seen.add(sum);
            sum = sumOfTheSquaresOfIntegerDigits(sum);
        }
        return sum == 1;
    }

    private int sumOfTheSquaresOfIntegerDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            sum += d * d;
        }
        return sum;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isHappy(19)); // true
        System.out.println(s.isHappy(2)); // false
    }
}
