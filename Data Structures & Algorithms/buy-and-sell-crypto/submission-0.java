class Solution {
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                res = Math.max(res, profit);
            }
        }

        return res;
    }
}
