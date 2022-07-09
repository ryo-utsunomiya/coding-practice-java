package leetcode.richestcustomerwealth;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int money : account) {
                wealth += money;
            }
            max = Math.max(max, wealth);
        }
        return max;
    }

    public static void main(String[] args) {
        var s = new Solution();
        {
            int[][] accounts = new int[2][3];
            accounts[0] = new int[]{1,2,3};
            accounts[1] = new int[]{3,2,1};
            System.out.println(s.maximumWealth(accounts)); // 6
        }
        {
            int[][] accounts = new int[4][2];
            accounts[0] = new int[]{1,5};
            accounts[1] = new int[]{7,3};
            accounts[2] = new int[]{3,5};
            System.out.println(s.maximumWealth(accounts)); // 10
        }
    }
}
