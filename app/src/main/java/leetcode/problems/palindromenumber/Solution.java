package leetcode.problems.palindromenumber;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

//    public static void main(String[] args) {
//        var s = new Solution();
//        System.out.println(s.isPalindrome(121));
//        System.out.println(s.isPalindrome(-121));
//        System.out.println(s.isPalindrome(10));
//        System.out.println(s.isPalindrome(-101));
//    }
}
