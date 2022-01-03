package leetcode.problems.validanagram;

import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram/
public class Solution {
//    public boolean isAnagram(String s, String t) {
//        List<String> sList = Arrays.stream(s.split("")).sorted().collect(Collectors.toList());
//        List<String> tList = Arrays.stream(t.split("")).sorted().collect(Collectors.toList());
//        return sList.equals(tList);
//    }

    public boolean isAnagram(String s, String t) {
        var histogram = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            histogram.put(c, histogram.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!histogram.containsKey(c)) {
                return false;
            }
            histogram.put(c, histogram.get(c) - 1);
        }
        for (int count : histogram.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isAnagram("anagram", "nagaram")); // true
        System.out.println(s.isAnagram("rat", "car")); // false
        System.out.println(s.isAnagram("えいご", "ごえい")); // true
        System.out.println(s.isAnagram("にほんご", "にほんめ")); // false
    }
}
