package leetcode.reversewordsinastring3;

// https://leetcode.com/problems/reverse-words-in-a-string/
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.reverseWords("Let's take LeetCode contest"));
        System.out.println(s.reverseWords("Let's take LeetCode contest").equals("s'teL ekat edoCteeL tsetnoc"));
        System.out.println(s.reverseWords("God Ding").equals("doG gniD"));
    }
}
