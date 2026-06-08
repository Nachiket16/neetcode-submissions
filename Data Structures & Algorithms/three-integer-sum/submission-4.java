class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length && nums[i]<=0; i++){
            if(i == 0 || nums[i]!=nums[i-1]){
                twoSum(i,nums,result);    
            }
        }
        return result;
    }

    void twoSum(int initial, int[]nums, List<List<Integer>> result){
        int left = initial + 1;
        int right = nums.length - 1;

        while(left<right){
            int sum = nums[initial] + nums[left] + nums[right];

            if(sum<0){
                ++left;
            }else if(sum > 0){
                --right;
            }else{
                result.add(Arrays.asList(nums[initial],nums[left++],nums[right--]));
                while(left<right && nums[left] == nums[left-1]){
                    ++left;
                }
            }
        }
    }
}
