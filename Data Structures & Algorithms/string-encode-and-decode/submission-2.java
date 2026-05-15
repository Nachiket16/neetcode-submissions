class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();

        for(String str : strs){
            encode.append(str.length()).append('#').append(str);;
        }
        return encode.toString();

    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();
        int i = 0;

        while(i<str.length()){
            int start = i;
            while(str.charAt(start)!='#'){
                start++;
            }
            int len = Integer.parseInt(str.substring(i,start));
            start++; //Skip #

            if(start+len > str.length()) break;

            String word = str.substring(start,start+len);
            list.add(word);
            i = start+len;

        }

        return list;
    }
}
