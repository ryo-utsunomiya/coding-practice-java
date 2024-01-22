package leetcode.pow;

public class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }

        // Using long because -n overflows when n is the minimum integer.
        long N = n;
        if (n < 0) {
            x = 1/x;
            N = -n;
        }

        return fastPow(x, N);
    }

    double fastPow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        // x^2n = x^n * x^n
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.myPow(2.0, 10)); // 1024.0
        System.out.println(s.myPow(2.1, 3)); // 9.26100
        System.out.println(s.myPow(2.0, -2)); // 0.25
        System.out.println(s.myPow(-3.39758, 5)); // -452.73957360169936
    }
}
