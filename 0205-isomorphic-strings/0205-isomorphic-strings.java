class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> has=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(has.containsKey(ch1)){
                if(has.get(ch1)!=ch2){
                    return false;
                }
            }
            else if(has.containsValue(ch2)){
                return false;
            }
            has.put(ch1,ch2);
        }
        return true;
    }
}