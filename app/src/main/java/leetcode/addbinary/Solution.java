package leetcode.addbinary;

public class Solution {
    public String addBinary(String a, String b) {
        if (a.equals("0")) {
            return b;
        } else if (b.equals("0")) {
            return a;
        }

        char[] aReversed = new StringBuilder(a).reverse().toString().toCharArray();
        char[] bReversed = new StringBuilder(b).reverse().toString().toCharArray();
        int maxLen = Math.max(aReversed.length, bReversed.length);
        var sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < maxLen; i++) {
            int aInt = 0;
            int bInt = 0;
            if (i < aReversed.length) {
                aInt = Character.getNumericValue(aReversed[i]);
            }
            if (i < bReversed.length) {
                bInt = Character.getNumericValue(bReversed[i]);
            }

            int sum = aInt + bInt + carry;
            if (sum == 3) {
                sb.append('1');
                carry = 1;
            } else if (sum == 2) {
                sb.append('0');
                carry = 1;
            } else if (sum == 1) {
                sb.append('1');
                carry = 0;
            } else {
                sb.append('0');
                carry = 0;
            }
        }
        if (carry == 1) {
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.addBinary("11", "1")); // 100
        System.out.println(s.addBinary("1010", "1011")); // 10101
        // ???
        System.out.println(s.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
