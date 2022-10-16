package leetcode.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> charToIndex = new HashMap<>();

        for (int left = 0, right = 0, len = s.length(); right < len; right++) {
            char c = s.charAt(right);
            if (charToIndex.containsKey(c)) {
                left = Math.max(left, charToIndex.get(c) + 1);
            }
            max = Math.max(max, right - left + 1);
            charToIndex.put(c, right);
        }

        return max;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(s.lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(s.lengthOfLongestSubstring("pwwkew")); // 3
        System.out.println(s.lengthOfLongestSubstring("aab")); // 2
        System.out.println(s.lengthOfLongestSubstring("dvdf")); // 3(vdf)
    }
}
