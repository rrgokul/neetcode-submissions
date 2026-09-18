class Solution {
    public int search(int[] nums, int target) {
        int maxInd = findMaxIndex(nums, 0, nums.length - 1);
        //now determine which segment to search
        if(target >= nums[0] && target <= nums[maxInd]){
            return searchNum(nums, 0, maxInd, target);
        } else {
            return searchNum(nums, maxInd+1, nums.length-1, target);
        }
    }

    public int findMaxIndex(int[] nums, int l, int r) {
        if(l == r){
            return l;
        }
        if(nums[l] < nums[r]){
            return r;
        }
        int m = l + (r-l)/2;
        if(nums[m] > nums[m+1]){
            return m;
        }
        if(nums[m] >= nums[l]){
            //left part is sorted and pivot/max is to the right
            return findMaxIndex(nums, m+1, r);
        } else {
            //right part is sorted and pivot/max is to the left
            return findMaxIndex(nums, l, m-1);
        }
    }    
    public int searchNum(int[] nums, int l, int r, int target){
        if(l > r){
            return -1;
        }
        int m = l + (r-l)/2;
        if(nums[m] == target){
            return m;
        } else if (nums[m] > target){
            return searchNum(nums, l, m-1, target);
        }else {
            return searchNum(nums, m+1, r, target);
        }
    }
}