class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int curr=1;
        int res=1;
        if(n==1){
            return 1;
        }
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                curr++;
            }
            else{
                curr=1;
            }
            res=Math.max(res,curr);
        }
        return res;
    }
}