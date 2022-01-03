package leetcode.problems.implementstrstr;

public class Solution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength == 0) {
            return 0;
        }
        if (haystackLength == 0) {
            return -1;
        }

        char first = needle.charAt(0);
        int max = haystackLength - needleLength;

        for (int i = 0; i <= max; i++) {
            char c = haystack.charAt(i);
            if (c == first) {
                int j = i + 1;
                int end = j + needleLength - 1;
                int k = 1;
                while (j < end && haystack.charAt(j) == needle.charAt(k)) {
                    j++;
                    k++;
                }
                if (j == end) {
                    return i;
                }
            }
        }

        return -1;
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
