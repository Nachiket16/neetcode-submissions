class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] lh = new int[len];
        int[] rh = new int[len];

        int leftHeight = 0;
        int reightHeight = 0;    
        int water = 0;    
        for(int i=0; i<len; i++){
            if(height[i]>leftHeight){
                leftHeight = height[i];
            }
            lh[i] = leftHeight;
        }

        for(int i=len-1; i>=0; i--){
            if(height[i]>reightHeight){
                reightHeight = height[i];
            }
            rh[i] = reightHeight;
        }  

        for(int i=0; i<len; i++){
            water = water + (Math.min(lh[i],rh[i])-height[i]);
        }      
        return water;
    }
}
