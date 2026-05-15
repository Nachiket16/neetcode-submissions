class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        Map<Integer, Integer> sortedMap = map.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(
            Map.Entry::getKey,
            Map.Entry::getValue,
            (e1, e2) -> e1,
            LinkedHashMap::new
        ));
        int[] output = new int[k];
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(sortedMap.entrySet());

        for(int i = 0 ; i<k; i++){
            Map.Entry<Integer, Integer> entry = entryList.get(i);
            output[i] = entry.getKey();
        }
        
        return output;
    }
}
