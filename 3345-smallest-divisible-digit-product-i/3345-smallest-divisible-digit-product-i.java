class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(pro(n)%t==0){
                return n;
            }
            n++;
        }
    }
    public int pro(int a){
        int p=1;
        while(a>0){
            int digit=a%10;
            p=p*digit;
            a=a/10;
        }
        return p;
    }
}