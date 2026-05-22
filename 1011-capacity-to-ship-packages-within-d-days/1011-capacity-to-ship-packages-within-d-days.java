class Solution {
    private boolean isPossible(int[] weights,int days,int cap){
        int reDays=1;
        int curr=0;
        for(int weight:weights){
            if(curr+weight>cap){
                reDays++;
                curr=weight;
            }
            else{
                curr+=weight;
            }
        }
        return reDays<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        int res=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isPossible(weights,days,mid)){
                res=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
}