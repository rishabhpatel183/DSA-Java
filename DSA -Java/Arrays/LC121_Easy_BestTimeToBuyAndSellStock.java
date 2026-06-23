/*
LeetCode: 121
Title: Best Time to Buy and Sell Stock
Difficulty: Easy

Pattern:
Min/Max Tracking

Time Complexity: O(n)
Space Complexity: O(1)

Learning:
Keep track of the minimum value seen so far.
Use it to calculate the best profit at each step.
*/
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                profit = prices[i] - minPrice;
            }
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}