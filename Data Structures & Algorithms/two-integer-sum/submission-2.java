class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Two Pointer Solution
        int[] response = new int[2];
        //Create a copy array with the indexes along with index
        int[][] copy = new int[nums.length][2];
        
        for(int i=0;i<nums.length;i++){
            copy[i][0] = nums[i];
            copy[i][1] = i;            
        }
        Arrays.sort(copy, Comparator.comparing(entry -> entry[0]));
        
        int i=0;
        int j=nums.length-1;
        while(i < j){
            if(copy[i][0]+copy[j][0]==target){
                break;
            } else if(copy[i][0] + copy[j][0] > target){
                j--;
            } else if (copy[i][0] + copy[j][0] < target){
                i++;
            } 
        }
        response[0]= Math.min(copy[i][1], copy[j][1]);
        response[1]= Math.max(copy[i][1], copy[j][1]);
        return response;
    }
}
