class Solution {
    public int countDigits(int num) {
        int or=num;
        int count=0;
        while(or>0){
            int digit=or%10;
            if(num%digit==0){
                count=count+1;
            }
            or/=10;
        }
        return count;
    }
}