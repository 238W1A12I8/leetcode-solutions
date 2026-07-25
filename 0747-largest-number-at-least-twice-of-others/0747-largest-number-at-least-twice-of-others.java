class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int m=Integer.MIN_VALUE;
        int maxIndex=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>m){
                m=nums[i];
                maxIndex=i;
            }
        }
        for(int x:nums){
            if(x!=m && m<2*x){
                return -1;
            }
        }
        return maxIndex;
    }
}