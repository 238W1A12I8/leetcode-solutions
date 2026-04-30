class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][][]=new int[m][n][k+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               for(int l=0;l<=k;l++){
                dp[i][j][l]=-1;
               }
            }
        }
        dp[0][0][0]=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int l=0;l<=k;l++){
                    if(dp[i][j][l]==-1) continue;
                    if(i+1<m){
                        int v=grid[i+1][j];
                        int c=(v==0?0:1);
                        int nc=l+c;
                        if(nc<=k){
                            dp[i+1][j][nc]=Math.max(dp[i+1][j][nc],dp[i][j][l]+v);
                        }
                    }
                    if(j+1<n){
                        int v=grid[i][j+1];
                        int c=(v==0?0:1);
                        int nc=l+c;
                        if(nc<=k){
                            dp[i][j+1][nc]=Math.max(dp[i][j+1][nc],dp[i][j][l]+v);
                        }
                    }
                }
            }
        }
        int ans=-1;
        for(int l=0;l<=k;l++){
            ans=Math.max(ans,dp[m-1][n-1][l]);
        }
        return ans;
    }
}