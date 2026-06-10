class Solution {
    public int minDays(int[] arr, int m, int k) {
        int l=1,h=1000000000,min=-1;
        while(l<=h){
            int mid=(h-l)/2+l;
            if(check(mid,arr,m,k)){
                h=mid-1;
                min=mid;
            }
            else{
                l=mid+1;
            }
        }
        return min;
    }
    private boolean check(int mid,int[] arr,int m,int k){
        int left=0,right=0,c=0;
        while(right<arr.length && c<m){
            if(arr[right]>mid || right-left+1==k){
                left=right+1;
                c=arr[right]>mid?c:c+1;
            }
            right++;
        }
        return c==m;
    }
}