class Solution {
    public int findMin(int[] nums) {
        int n = nums.length-1;
        int first=nums[0];
        int last = nums[n];
        int min = first;

        while(first>last){
            min = Math.min(first,last);
            last = nums[--n];
        }
        return min;
        
    }
}
