package leetcode.groupanagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return List.of();
        }

        var anagrams = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!anagrams.containsKey(key)) {
                anagrams.put(key, new LinkedList<>());
            }
            anagrams.get(key).add(str);
        }
        return new LinkedList<>(anagrams.values());
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(s.groupAnagrams(new String[]{""}));
        System.out.println(s.groupAnagrams(new String[]{"a"}));
    }
}
