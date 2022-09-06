package leetcode.besttimetobuyandsellstock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.maxProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(s.maxProfit(new int[]{7,6,4,3,1})); // 0
        System.out.println(s.maxProfit(new int[]{2,1,2,0,1})); // 1
    }
}
