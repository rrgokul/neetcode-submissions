class Solution {
    public int maxArea(int[] heights) {
       int i=0,j=heights.length-1;
       int max = 0;
       for(;i<j;){
         boolean moved = false;
         int volume = (j-i)*Math.min(heights[i], heights[j]);
         max = Math.max(max, volume);
         if(heights[i] <= heights[j]){
            i++;
            moved=true;
         } else {
            j--;
         }
       }
       return max;

    }
}
