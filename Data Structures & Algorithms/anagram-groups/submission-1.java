class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chr = str.toCharArray();
            Arrays.sort(chr);
            String sorted = new String(chr);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
        }

        List<List<String>> output = new ArrayList<>();
        
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            output.add(entry.getValue());
        }

        return output;

    }
}
