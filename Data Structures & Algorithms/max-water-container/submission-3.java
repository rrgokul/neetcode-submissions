class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        for(int l=0,r=heights.length-1;l<r;){
            int area = (r - l)*(Math.min(heights[l], heights[r]));
            max = Math.max(area, max);
            if(heights[r]>heights[l]){
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
