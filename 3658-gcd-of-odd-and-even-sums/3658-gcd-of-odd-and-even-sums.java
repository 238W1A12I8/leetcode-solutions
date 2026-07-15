class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            sum1+=2*i;
            sum2+=2*i-1;
        }
        while(sum1!=0){
            int t=sum1;
            sum1=sum2%sum1;
            sum2=t;
        }
        return sum2;
    }
}