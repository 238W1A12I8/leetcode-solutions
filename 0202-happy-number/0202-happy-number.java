class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=sq(n);
            if(n==1) return true;
        }
        return false;
    }
    public int sq(int num){
        int res=0;
        while(num>0){
            int rem=num%10;
            res+=rem*rem;
            num=num/10;
        }
        return res;
    }
}