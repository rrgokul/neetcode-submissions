class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for(int num: nums){
            int curr = counts.getOrDefault(num, 0);
            counts.put(num, ++curr);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)-> a[0] - b[0]);
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            queue.offer(new int[]{entry.getValue(), entry.getKey()});
            if(queue.size() > k){
                queue.poll();
            }
        }
        int[] response = new int[k];
        for(int i=0;i<k;i++){
            response[i] = queue.poll()[1];
        }
        return response;
    }
}
