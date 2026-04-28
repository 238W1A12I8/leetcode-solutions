class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> list=new ArrayList<>();
        for(int[] r:grid){
            for(int num:r){
                list.add(num);
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