class Solution {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int ans = 0 ;

        for(int price : prices){
            if(price<min){
                min = price;
            }
            if(ans<price-min){
                ans = price-min;
            }
        }

        return ans;
        
    }
}
