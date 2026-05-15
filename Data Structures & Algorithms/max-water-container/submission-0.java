class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int area = 0;

        while(l<r){
            int a = (r-l) * Math.min(heights[l],heights[r]);
            if(area<a){
                area = a;
            }
            if(heights[l]<heights[r]){
                l++;
            }else if(heights[l]>heights[r]){
                r--;
            }else{
                l++;
                r--;
            }
        }

        return area;
        
    }
}
