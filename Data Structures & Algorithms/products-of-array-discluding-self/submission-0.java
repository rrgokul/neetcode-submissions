class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        int product = 1;
        for(int i=0;i<nums.length;i++){
            prefix[i] = product;
            product *= nums[i];
        }
        product = 1;
        for(int i=nums.length-1;i>=0;i--){
            suffix[i] = product;
            product *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            result[i] = prefix[i]*suffix[i];
        }    
        return result;
    }
}  
