class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] result = new int[size];

        for(int i=0; i<size-1; i++){
            int curr = temperatures[i];
            int counter = 0;
            for(int j=i; j<size; j++){
                if(curr < temperatures[j]){
                    counter = j-i;
                    break;
                }
            }
            result[i] = counter;
        }
        return result;
    }
}
