class Solution {
    public int findMin(int[] nums) {
        int i = findMinimum(nums, 0, nums.length-1);
        return nums[i];
    }

    public int findMinimum(int[] nums, int l, int r){
        if(l == r){
            return l;
        }
        int m = l + (r-l)/2;
        if(m == l){
            return nums[l] < nums[r] ? l : r;
        }
        
        if(nums[r] < nums[m]){
            return findMinimum(nums, m, r);
        } else {
            return findMinimum(nums, l, m);
        }
    }
}
