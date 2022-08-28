package leetcode.kthsymbolingrammar;

public class Solution {
    /*
     * n=1: row=0
     * n=2: row=01
     * n=3: row=0110
     * n=4: row=01101001
     */
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int parentK;
        if (k % 2 == 0) {
            parentK = k/2;
        } else {
            parentK = (k+1)/2;
        }
        int parentBit = kthGrammar(n - 1, parentK);
        if (parentBit == 0) {
            if (k % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (k % 2 == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.kthGrammar(1, 1)); // 0
        System.out.println(s.kthGrammar(2, 1)); // 0
        System.out.println(s.kthGrammar(2, 2)); // 1
        System.out.println(s.kthGrammar(3, 4)); // 0
        System.out.println(s.kthGrammar(4, 8)); // 1
        System.out.println(s.kthGrammar(30, 2)); // 1
    }
}
