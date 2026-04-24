class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0;
        int r=0;
        int u=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L') l=l+1;
            else if(moves.charAt(i)=='R') r=r+1;
            else{
                u=u+1;
            }
        }
        int res=0;
        if(l<r){
            res+=r+u-l;
        }
        else{
            res+=l+u-r;
        }
        return res;
    }
}