package leetcode.problems.reverseinteger;

// https://leetcode.com/problems/reverse-integer/
class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // When rev is larger than 214748364, it will overflow in the next loop.
            if (rev > Integer.MAX_VALUE / 10) {
                return 0;
            }
            // Since Integer.MAX_VALUE is 2147483647,
            // if rev is 214748364 and pop is larger than 7, rev will overflow.
            if (rev == Integer.MAX_VALUE / 10 && pop > 7) {
                return 0;
            }
            // When rev is smaller than -214748364, it will overflow in the next loop.
            if (rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            // Since Integer.MIN_VALUE is -2147483648,
            // if rev is -214748364 and pop is smaller than -8, rev will overflow.
            if (rev == Integer.MIN_VALUE / 10 && pop < -8) {
                return 0;
            }

            rev = rev * 10 + pop;
            System.out.println("x=" + x + " pop=" + pop + " rev=" + rev);
        }
        return rev;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.reverse(123)); // 321
        System.out.println(s.reverse(-123)); // -321
        System.out.println(s.reverse(120)); // 21
        System.out.println(s.reverse(0)); // 0
        System.out.println(s.reverse(Integer.MAX_VALUE)); // 0
        System.out.println(s.reverse(Integer.MIN_VALUE)); // 0
    }
}
