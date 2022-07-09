package crackingthecodinginterview.palindromepermutation;

// 1.4 Palindrome Permutation
// Given a string, write a function to check if it is a permutation of a palindrome.
// A palindrome is a word or phrase that is the same forwards and backwards.
// A permutation is a rearrangement of letters.
// The palindrome does not need to be limited to just dictionary words.
public class Solution {
    public boolean isPermutationOfPalindrome(String phrase) {
        return checkMaxOneOdd(buildCharFrequencyTable(phrase));
    }

    private final int CHAR_TABLE_SIZE = Character.getNumericValue('z') - Character.getNumericValue('a') + 1;

    private int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[CHAR_TABLE_SIZE];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    private int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    private boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.isPermutationOfPalindrome("Tact Coa")); // true
        System.out.println(s.isPermutationOfPalindrome("hello")); // false
        System.out.println(s.isPermutationOfPalindrome("Madam Im Adam")); // true
    }
}
