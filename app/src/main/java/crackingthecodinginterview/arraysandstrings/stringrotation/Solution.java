package crackingthecodinginterview.arraysandstrings.stringrotation;

// 1.9 String Rotation
// Assume you have a method isSubstring which checks if one word is a substring of another.
// Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only
// one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
public class Solution {
    public boolean checkRotation(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            return isSubstring(s2 + s2, s1);
        }
        return false;
    }

    public boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.checkRotation("waterbottle", "erbottlewat")); // true
        System.out.println(s.checkRotation("waterbottle", "erbottlwat")); // false
    }
}
