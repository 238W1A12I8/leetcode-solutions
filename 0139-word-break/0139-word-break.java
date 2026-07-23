class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);
        Boolean bool[]=new Boolean[s.length()];
        return helper(s,0,set,bool);
    }
    public boolean helper(String s,int st,Set<String> set,Boolean[] bool){
        int n=s.length();
        if(st==n) return true;
        if(bool[st]!=null) return bool[st];
        for(int i=st+1;i<=n;i++){
            String prev=s.substring(st,i);
            if(set.contains(prev)&& helper(s,i,set,bool)){
                return bool[st]=true;
            }
        }
        return bool[st]=false;
    }
}