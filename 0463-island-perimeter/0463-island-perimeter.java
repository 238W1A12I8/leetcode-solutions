class Solution {
    public int islandPerimeter(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int area=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if((j>0 && grid[i][j-1]==0)||j==0){
                        area++;
                    }
                    if((i>0 && grid[i-1][j]==0) || i==0){
                        area++;
                    }
                    if((j<n-1 && grid[i][j+1]==0) || j==n-1){
                        area++;
                    }
                    if((i<m-1 && grid[i+1][j]==0) || i==m-1){
                        area++;
                    }
                }
            }
        }
        return area;
    }
}