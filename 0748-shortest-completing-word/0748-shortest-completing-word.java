class Solution {
    public String shortestCompletingWord(String li, String[] words) {
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:li.toCharArray()){
            if(Character.isLetter(ch)){
                ch=Character.toLowerCase(ch);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
        }
        String str="";
        for(String word:words){
            Map<Character,Integer> map2=new HashMap<>(map);
            for(char ch:word.toCharArray()){
                if(map2.containsKey(ch)){
                   map2.put(ch,map2.get(ch)-1);
                   if(map2.get(ch)==0){
                    map2.remove(ch);
                   }
                }
            }
            if(map2.isEmpty()){
                if(str.equals("")||word.length()<str.length()){
                    str=word;
                }
            }
        }
        return str;
    }
}