class Solution {
    public int countDigits(int num) {
        int count=0;
        String[] s=String.valueOf(num).split("");
        for(String s1:s){
            int d=Integer.parseInt(s1);
            if(num%d==0){
                count=count+1;
            }
        }
        return count;
    }
}