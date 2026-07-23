class Solution {
    public int smallestEvenMultiple(int n) {
        int ans=Integer.MAX_VALUE;
        int res=0;
        if(n%2==0) return n;
        else{
            res=n*2;
        }
        ans=Math.min(ans,res);
        return ans;
    }
}