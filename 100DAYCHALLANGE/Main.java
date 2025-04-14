// LeetCode 121: Best Time to Buy and Sell Stock
// Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Main {

    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }


    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices)); 

    }
}

