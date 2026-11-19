class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(prices == null || n == 0)
        {
            return 0;
        }
        int maxprofit = 0, minprice = Integer.MAX_VALUE;
        for(int p : prices)
        {
            if(p < minprice)
            {
                minprice = p;
            }
            else
            {
                int profit = p - minprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }
        return maxprofit;
    }
}
