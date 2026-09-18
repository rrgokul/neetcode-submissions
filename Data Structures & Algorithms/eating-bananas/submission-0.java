class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = Arrays.stream(piles).max().getAsInt();
        int result = r;
        int l = 1;
        while(l <= r){
            int m = l + (r-l)/2;
            //find hours required 
            int total = 0;
            for(int pile : piles){
                total += Math.ceil((double)pile/m);
            }

            if(total <= h){
                result = m;
                r = m-1;
            } else {
                l = m+1;
            }

        }
        return result;
    }
}
