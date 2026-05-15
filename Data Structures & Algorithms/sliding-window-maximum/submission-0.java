class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        int size = len-(k-1);
        int[] ans = new int[size];

        for(int i=0; i<size; i++){
            int end = i+k;
            int max = getMaxElement(i,end,nums);
            ans[i]=max;
        }
        return ans;
        
    }

    private int getMaxElement(int s, int e, int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = s; i<e; i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}
