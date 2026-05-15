class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        char[] sArr= s.toCharArray();
        char[] tArr= t.toCharArray();

        for(int i=0; i<sArr.length; i++){
            sMap.put(sArr[i],sMap.getOrDefault(sArr[i],0)+1);
            tMap.put(tArr[i],tMap.getOrDefault(tArr[i],0)+1);
        }

        for(Map.Entry<Character, Integer> i : sMap.entrySet()){
            //Key value from t -> deduct from s
            Integer d = i.getValue() - tMap.getOrDefault(i.getKey(),0);
            if(d != 0){
                return false;
            }
        }

        return true;
    }
}
