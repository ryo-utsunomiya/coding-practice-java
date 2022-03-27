package leetcode.romantointeger;

public class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int result = 0;

        String[] chars = s.split("");
        for (int i = 0; i < chars.length; i++) {
            String c = chars[i];
            String next = null;
            boolean hasNext = i + 1 < chars.length;
            if (hasNext) {
                next = chars[i+1];
            }

            if ("M".equals(c)) {
                result += 1000;
            } else if ("D".equals(c)) {
                result += 500;
            } else if ("C".equals(c)) {
                if (hasNext && ("M".equals(next) || "D".equals(next))) {
                    result -= 100;
                } else {
                    result += 100;
                }
            } else if ("L".equals(c)) {
                result += 50;
            } else if ("X".equals(c)) {
                if (hasNext && ("L".equals(next) || "C".equals(next))) {
                    result -= 10;
                } else {
                    result += 10;
                }
            } else if ("V".equals(c)) {
                result += 5;
            } else if ("I".equals(c)) {
                if (hasNext && ("X".equals(next) || "V".equals(next))) {
                    result -= 1;
                } else {
                    result += 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.romanToInt("III")); // 3
        System.out.println(s.romanToInt("LVIII")); // 58
        System.out.println(s.romanToInt("MCMXCIV")); // 1994
    }
}
