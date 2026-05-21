class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int left=1;
        int right=(int) Math.pow(10,9);
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isPossible(piles,h,mid)){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    boolean isPossible(int piles[],int h,int k){
        for(int i=0;i<piles.length;i++){
            int value=piles[i];
            int temp=value/k;
            if(value%k!=0){
                temp++;
            }
            h-=temp;
            if(h<0){
                return false;
            }
        }
        return true;
    }
}