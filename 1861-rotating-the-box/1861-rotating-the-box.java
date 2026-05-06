class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m=boxGrid.length;
        int n=boxGrid[0].length;
        char[][] res=new char[n][m];
        for(char[] row:res){
            Arrays.fill(row,'.');
        }
        for(int i=0;i<m;i++){
            int e=n-1;
            for(int j=n-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    res[j][m-1-i]='*';
                    e=j-1;
                }
                else if(boxGrid[i][j]=='#'){
                    res[e][m-1-i]='#';
                    e--;
                }
            }
        }
        return res;
    }
}