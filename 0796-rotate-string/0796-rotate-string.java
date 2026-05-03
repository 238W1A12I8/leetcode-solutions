class Solution {
    public boolean rotateString(String s, String goal) {
        Map<Character,Integer> map=new HashMap<>();
        Map<Character,Integer> map1=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch1:goal.toCharArray()){
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        if(!map.equals(map1)){
            return false;
        }
        for(int i=0;i<s.length();i++){
            String r=s.substring(i)+s.substring(0,i);
            if(r.equals(goal)){
                return true;
            }
        }
        return false;
    }
}