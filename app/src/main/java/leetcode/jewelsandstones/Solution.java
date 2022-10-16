package leetcode.jewelsandstones;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelsSet.add(jewel);
        }
        int numJewels = 0;
        for (char stone : stones.toCharArray()) {
            if (jewelsSet.contains(stone)) {
                numJewels++;
            }
        }
        return numJewels;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.numJewelsInStones("aA", "aAAbbbb")); // 3
        System.out.println(s.numJewelsInStones("z", "ZZ")); // 0
    }
}
