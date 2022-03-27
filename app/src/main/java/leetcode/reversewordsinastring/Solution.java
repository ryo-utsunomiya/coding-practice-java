package leetcode.reversewordsinastring;

// https://leetcode.com/problems/reverse-words-in-a-string/
public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split(" +");
        String[] reversed = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reversed[i] = words[words.length - i - 1];
        }
        return String.join(" ", reversed);
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.reverseWords("the sky is blue").equals("blue is sky the"));
        System.out.println(s.reverseWords("  hello world  ").equals("world hello"));
        System.out.println(s.reverseWords("a good   example").equals("example good a"));
    }
}
