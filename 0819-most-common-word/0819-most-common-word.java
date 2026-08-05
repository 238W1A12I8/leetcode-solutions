class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set=new HashSet<>();
        Map<String,Integer> map=new HashMap<>();
        for(String s:banned){
            set.add(s.toLowerCase());
        }
        String ans="";
        int maxFre=0;
        String[] p=paragraph.toLowerCase().replaceAll("[^a-z]"," ").split("\\s+");
        for(String s:p){
            if(!set.contains(s)){
                int fre=map.getOrDefault(s,0)+1;
                map.put(s,fre);
                if(fre>maxFre){
                    ans=s;
                    maxFre=fre;
                }
            }
        }
        return ans;
    }
}