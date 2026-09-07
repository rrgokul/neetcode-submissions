class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false;
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : nums){
            if(numSet.contains(num)){
                isDuplicate = true;
                break;
            }
            numSet.add(num);
        }
        return isDuplicate;
    }
}