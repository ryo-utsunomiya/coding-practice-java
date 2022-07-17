package crackingthecodinginterview.arraysandstrings.stringcompression;

// 1.6 String Compression
// Implement a method to perform basic string compression using the counts of repeated characters.
// For example, string aabcccccaaa would become a2b1c5a3.
// If the "compressed" string would not become smaller than original string, your method should return the original string.
// You can assume the string has only uppercase and lowercase letters (A-Za-z).
public class Solution {
    public String compress(String str) {
        var compressed = new StringBuilder();
        var countConsecutive = 0;
        for (var i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.compress("")); // empty string
        System.out.println(s.compress("a")); // a
        System.out.println(s.compress("aa")); // aa
        System.out.println(s.compress("aaabbcc")); // a3b2c2
    }
}
