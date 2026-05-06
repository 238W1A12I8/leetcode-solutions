class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length;
        int m=boxGrid[0].length;
        char[][] res=new char[m][n];
        for(int i=0;i<n;i++){
            int e=m-1;
            for(int j=m-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    e=j-1;
                }
                else if(boxGrid[i][j]=='#'){
                    char temp=boxGrid[i][j];
                    boxGrid[i][j]=boxGrid[i][e];
                    boxGrid[i][e]=temp;
                    e--;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                res[j][n-1-i]=boxGrid[i][j];
            }
        }
        return res;
    }
}