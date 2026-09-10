class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int lowest = 101;
        for(int i=0;i<prices.length;i++){
            max = Math.max(max, prices[i]-lowest);
            lowest = Math.min(lowest, prices[i]);
        }
        return max;

    }
}
