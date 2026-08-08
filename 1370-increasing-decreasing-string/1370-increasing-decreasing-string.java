class Solution {
    public String sortString(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder str=new StringBuilder();
        while(str.length()<s.length()){
            for(char ch='a';ch<='z';ch++){
                if(map.containsKey(ch)){
                    str.append(ch);
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0){
                    map.remove(ch);
                    }
                }
            }
            for(char ch='z';ch>='a';ch--){
                if(map.containsKey(ch)){
                    str.append(ch);
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0){
                    map.remove(ch);
                    }
                }
            }
        }
        return str.toString();   
    }
}