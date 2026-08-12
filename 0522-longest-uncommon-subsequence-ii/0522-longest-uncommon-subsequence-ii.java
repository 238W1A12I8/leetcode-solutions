class Solution {
    public int findLUSlength(String[] strs) {
        int n=strs.length;
        Map<String,Integer> map=new HashMap<>();
        int ans=-1;
        for(String s:strs){
           map.put(s,map.getOrDefault(s,0)+1);
        }
        for(int i=0;i<strs.length;i++){
            if(map.get(strs[i])>1){
                continue;
            }
            boolean flag=true;
            for(int j=0;j<strs.length;j++){
                if(i==j) continue;
                if(helper(strs[i],strs[j])){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans=Math.max(ans,strs[i].length());
            }
        }
        return ans;
    }
    public boolean helper(String x,String y){
        if(x.length()>y.length()){
            return false;
        }
        int i=0,j=0;
        while(i<x.length() && j<y.length()){
            if(x.charAt(i)==y.charAt(j)){
                i++;
            }
            j++;
        }
        return i==x.length();
    }
}