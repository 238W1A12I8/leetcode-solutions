class Solution {
    public String getHint(String secret, String guess) {
        int n=guess.length();
        Map<Character,Integer> map1=new HashMap<>(); // sec
        Map<Character,Integer> map2=new HashMap<>(); // gue
        int b=0;
        int c=0;
        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g){
                b=b+1;
            }
            else{
                map1.put(s,map1.getOrDefault(s,0)+1);
                map2.put(g,map2.getOrDefault(g,0)+1);
            }
        }
        for(char ch:map1.keySet()){
            if(map2.containsKey(ch)){
                c+=Math.min(map1.get(ch),map2.get(ch));
            }
        }
        return b+"A"+c+"B";
    }
}