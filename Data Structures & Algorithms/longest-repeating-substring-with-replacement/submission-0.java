class Solution {
    public int characterReplacement(String s, int k) {
        //Alphabet occurance counter
        int[] occurance = new int[26];
        int left = 0, right = 0, ans = 0, maxOccurance = 0;
        
        for(; right<s.length(); right++){
            //for current sub string max occu len
            maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right)-'A']);
            if(right-left+1-maxOccurance > k){
                occurance[s.charAt(left)-'A']--;
                left++;
            }

            ans = Math.max(ans, right-left+1);
        }

        return ans;

    }
}
