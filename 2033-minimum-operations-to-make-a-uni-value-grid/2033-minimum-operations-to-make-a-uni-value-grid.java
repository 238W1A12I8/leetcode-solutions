class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
        }
        int m=list.get(0)%x;
        for(int num:list){
            if(num%x!=m){
                return -1;
            }
        }
        Collections.sort(list);
        int op=0;
        int me=list.get(list.size()/2);
        for(int num:list){
            op+=Math.abs(num-me)/x;
        }
        return op;
    }
}