class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(helper(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean helper(int i){
        int or=i;
        while(i>0){
            int digit=i%10;
            if(digit==0 || or%digit!=0){
                return false;
            }
            i=i/10;
        }
        return true;
    }
}