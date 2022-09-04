package leetcode.groupshiftedstrings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    // O(n * s.length)
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> groups = new HashMap<>();
        // O(n)
        for (String s : strings) {
            // O(s.length)
            List<String> shiftedStrings = createShiftedStrings(s);
            String key = shiftedStrings.get(0);
            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    // O(C) where C = 26
    List<String> createShiftedStrings(String s) {
        var result = new ArrayList<String>();
        String current = s;
        while (result.size() < 26) {
            current = shiftString(current);
            result.add(current);
        }
        result.sort(Comparator.naturalOrder());
        return result;
    }

    // O(s.length)
    String shiftString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char newChar = (char) (chars[i] + 1);
            if (newChar == 'z'+1) {
                newChar = 'a';
            }
            chars[i] = newChar;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            var result = s.groupStrings(new String[]{"a"});
            System.out.println(result);
        }
        {
            var result = s.groupStrings(new String[]{"abc","bcd","acef","xyz","az","ba","a","z"});
            System.out.println(result);
        }
    }
}
