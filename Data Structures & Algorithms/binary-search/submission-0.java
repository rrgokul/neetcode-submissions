class Solution {
    public int search(int[] nums, int target) {
       return searchNum(nums, 0, nums.length-1, target);
    }
    public int searchNum(int[] nums, int l, int r, int target)   {
        if(l>r){
            return -1;
        }
        int m = l+(r-l)/2;
        if(nums[m] == target){
            return m; 
        }
        if(nums[m] > target){
            return searchNum(nums, l, m-1, target);
        } else {
            return searchNum(nums, m+1, r, target);
        }
    }    
}
