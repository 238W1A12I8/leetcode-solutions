class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int len=m*n;
        k%=len;
        int index=k;
        int temp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(index==len) index=0;
                int nm=index/n;
                int mn=index%n;
                temp[nm][mn]=grid[i][j];   
                index++;         
            }
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> dummy=new ArrayList<>();
            for(int j=0;j<n;j++){
                dummy.add(temp[i][j]);
            }
            list.add(dummy);
        }
        return list;
    }
}