package leetcode.implementstrstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.strStr("hello", "ll"));
        System.out.println(s.strStr("aaaaa", "bba"));
        System.out.println(s.strStr("", ""));
        System.out.println(s.strStr("aaa", "aaaa"));
        System.out.println(s.strStr("a", "a"));
    }
}
