class Solution {
    public int minCut(String s) {
        int n=s.length();
        boolean palindrome[][]=new boolean[n][n];
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=i;
            for(int j=0;j<=i;j++){
                if(s.charAt(j)==s.charAt(i) && (i-j<=2 || palindrome[j+1][i-1])){
                    palindrome[j][i]=true;
                    dp[i]=j==0? 0 : Math.min(dp[i],dp[j-1]+1); 
                }
            }
        }
        return dp[n-1];
    }
}