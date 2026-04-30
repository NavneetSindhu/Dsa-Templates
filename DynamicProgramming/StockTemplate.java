// ==========================================
// STOCK DP: THE STATE MACHINE TEMPLATE
// ==========================================
// States: 
// buy: 1 (allowed to buy), 0 (must sell)
// cap: k transactions allowed (Optional, for Stock III & IV)

class StockTemplate {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        
        // SPACE OPTIMIZATION: Only need "today" and "tomorrow"
        // [buy state 0/1][cap left 0 to k]
        int[][] front = new int[2][k + 1];
        int[][] curr  = new int[2][k + 1];
        
        // Base cases for day N and cap 0 are already 0 in Java.
        
        for (int i = n - 1; i >= 0; i--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int cap = 1; cap <= k; cap++) { // cap > 0 to allow transactions
                    int profit = 0;
                    
                    if (buy == 1) {
                        int doBuy  = -prices[i] + front[0][cap];
                        int skip   =  0         + front[1][cap];
                        profit = Math.max(doBuy, skip);
                    } else {
                        // DEDUCT CAP ON SELL (Or on Buy, just be consistent!)
                        int doSell =  prices[i] + front[1][cap - 1];
                        int skip   =  0         + front[0][cap];
                        profit = Math.max(doSell, skip);
                    }
                    curr[buy][cap] = profit;
                }
            }
            // Move today into tomorrow
            for (int b = 0; b < 2; b++) {
                System.arraycopy(curr[b], 0, front[b], 0, k + 1);
            }
        }
        
        return front[1][k]; // Start at day 0, allowed to buy, full cap
    }
}