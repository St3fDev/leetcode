class Solution {
    public int maxProfit(int[] prices) {
       int maxEarning = 0;
        for (int i = 0; i < prices.length; i++) {
            int minPrice = prices[i];
            int j = i + 1;
            for (; j < prices.length; j++) {
                if (prices[j] < minPrice) break;
                int currentPrice = prices[j] - minPrice;
                if (maxEarning < currentPrice) maxEarning = currentPrice; 
            }
            if (j == prices.length) break;
        }
        return maxEarning;
    }
}