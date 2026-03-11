class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        bt(s,0,path,res);
        return res;
    }
    private void bt(String s,int start,List<String> path, List<List<String>> res){
        if(start==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                path.add(s.substring(start,end+1));
                bt(s,end+1,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}