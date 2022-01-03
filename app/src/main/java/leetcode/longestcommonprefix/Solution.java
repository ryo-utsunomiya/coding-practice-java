package leetcode.longestcommonprefix;

// https://leetcode.com/problems/longest-common-prefix/
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        var sb = new StringBuilder();

        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = Math.min(str.length(), minLength);
        }
        for (int i = 0; i < minLength; i++) {
            Character c = null;
            boolean isCommon = true;
            for (String str : strs) {
                if (c == null) {
                    c = str.charAt(i);
                } else if (c != str.charAt(i)) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                sb.append(c);
            } else {
                break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.longestCommonPrefix(new String[]{"flower", "flow", "flight"})); // fl
        System.out.println(s.longestCommonPrefix(new String[]{"dog", "racecar", "car"})); //
        System.out.println(s.longestCommonPrefix(new String[]{"cir", "car"})); // c
    }
}
