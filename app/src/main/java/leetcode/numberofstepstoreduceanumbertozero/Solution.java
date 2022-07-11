package leetcode.numberofstepstoreduceanumbertozero;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class Solution {
    public int numberOfSteps(int num) {
        int numSteps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            numSteps++;
        }

        return numSteps;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.numberOfSteps(14)); // 6
        System.out.println(s.numberOfSteps(8)); // 4
    }
}
