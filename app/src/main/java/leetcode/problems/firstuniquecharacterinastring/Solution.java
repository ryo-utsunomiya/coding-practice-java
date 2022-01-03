package leetcode.problems.firstuniquecharacterinastring;

import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        var charCount = new HashMap<Character, Integer>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < len; i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

//    public static void main(String[] args) {
//        var s = new Solution();
//        System.out.println(s.firstUniqChar("leetcode")); // 0
//        System.out.println(s.firstUniqChar("loveleetcode")); // 2
//        System.out.println(s.firstUniqChar("aabb")); // -1
//    }
}
