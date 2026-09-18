class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> indices = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            if(i>0 && temperatures[i]>temperatures[i-1]){
                while(!indices.isEmpty() && temperatures[indices.peek()] < temperatures[i]){
                    int ind = indices.pop();
                    result[ind] = i-ind;
                }
            } 
            indices.push(i);
        }
        while(!indices.isEmpty()){
            result[indices.pop()] = 0;
        }
        return result;
    }
}
