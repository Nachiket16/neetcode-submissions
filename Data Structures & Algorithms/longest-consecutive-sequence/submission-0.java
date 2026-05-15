class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int count = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int curr=n;
                int len = 1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                count = Math.max(len,count);
            }

        }
        return count;
    }
}
