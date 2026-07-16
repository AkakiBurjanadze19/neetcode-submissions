class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxProfit(int[] prices) {
        int minBuy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int sell = prices[i];
            maxProfit = Math.max(maxProfit, sell - minBuy);
            minBuy = Math.min(minBuy, prices[i]);
        }

        return maxProfit;
    }
}
