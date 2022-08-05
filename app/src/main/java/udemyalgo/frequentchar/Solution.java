package udemyalgo.frequentchar;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public CharCount findMostFrequentChar(String s) {
        if (s == null || "".equals(s)) {
            return null;
        }

        var charCounts = new HashMap<Character, Integer>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }
        }

        var charCount = charCounts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        return new CharCount(charCount.getKey(), charCount.getValue());
    }

    static class CharCount {
        char c;
        int count;
        public CharCount(char c, int count) {
            this.c = c;
            this.count = count;
        }

        @Override
        public String toString() {
            return String.format("%s:%d", c, count);
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.findMostFrequentChar("hello")); // l:2
        System.out.println(s.findMostFrequentChar("This is a pen. This is an apple. Applepen.")); // p:6
    }
}
