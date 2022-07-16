package leetcode.findnumberswithevennumberofdigits;

public class Solution {
    public int findNumbers(int[] nums) {
        int answer = 0;

        for (int num : nums) {
            if (countDigits(num) % 2 == 0) {
                answer++;
            }
        }

        return answer;
    }

    private int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(s.findNumbers(new int[]{555,901,482,1771}));
    }
}
