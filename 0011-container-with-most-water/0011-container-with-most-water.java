class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int area=0;
        int maxArea=0;
        int width=0;

        while(left<right){
            width=right-left;
            int minHeight=Math.min(height[left],height[right]);
            area=width*minHeight;

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}