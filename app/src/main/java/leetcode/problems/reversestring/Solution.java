package leetcode.problems.reversestring;

public class Solution {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        var chars = new char[]{'h', 'e', 'l', 'o'};
        s.reverseString(chars);
        System.out.println(chars);
    }
}
