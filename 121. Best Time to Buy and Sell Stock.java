class Solution {
    public int maxProfit(int[] prices) {
        int diff = 0;
        int low = prices[0];
        for(int i = 1; i < prices.length; i++){
            low = Math.min(low, prices[i]);
            diff = Math.max(diff, prices[i] - low);
        }
        return diff;
    }
}
