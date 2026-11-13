class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            List<List<Integer>> res = twosum(nums, 0-num, num, i);
            for(List<Integer> tri : res){
                Collections.sort(tri);
                String key = tri.stream().map(String::valueOf).collect(Collectors.joining(","));
                if(!seen.contains(key)){
                    result.add(tri);
                    seen.add(key);
                }
            }
        }
        return result;

    }
    public List<List<Integer>> twosum(int[] nums, int target, int num, int index){
        Set<Integer> numset = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i=index+1;i<nums.length;i++){
            int n = nums[i];
            int diff = target - n;
            if(numset.contains(diff)){
                List<Integer> numrest = Arrays.asList(num, n, diff);
                result.add(numrest);
            }
            numset.add(n);
        }
        return result;
    }
}
