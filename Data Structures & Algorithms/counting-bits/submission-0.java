class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        for(int i=0;i<=n;i++){
            int res=0;
            for(int j=0;j<32;j++){
                if(((1 << j) & i) != 0){
                    res++;
                }

            }
            result[i] = res;

        }
    return result;
    }
}
