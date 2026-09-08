class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        HashSet<Integer> starts = new HashSet<>();
        for(int num: nums)
{
    numSet.add(num);
}        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(!numSet.contains(num-1)){
                starts.add(num);
            }
        }
        int maxLength = 0;
        System.out.println("starts.size()"+starts.size());
        for(int num : starts){
            int curr = num;
            while(numSet.contains(curr)){
                curr++;
            }
            maxLength = Math.max(maxLength, curr-num);
        }
        return maxLength;
    }
}
