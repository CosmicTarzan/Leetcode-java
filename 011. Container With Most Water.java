class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r){
            int area = Math.min(height[l], height[r]) * (r - l);
            if(area > maxArea){
                maxArea = area;
            }
            if (height[l] > height[r]){
                r -= 1;
            }
            else{
                l += 1;
            }
        }
        return maxArea;
    }
}
