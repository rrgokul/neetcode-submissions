class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int l=0,r=1;r<prices.length;){
            if(prices[r]<=prices[l]){
                l=r;
                r++;
            }else{
                //profit found
                max = Math.max(max, prices[r]-prices[l]);
                r++;
            }

        }
        return max;

    }
}
