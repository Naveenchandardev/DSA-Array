package com.practice.dsa.array.leetcodeTwo;

public class Stocks_2 {
    public static void main(String[] args) {
        int[] prices = {2,1};
        System.out.println("Max Profit: " + maxProfit(prices)); // Output: 5
    }
    private static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
