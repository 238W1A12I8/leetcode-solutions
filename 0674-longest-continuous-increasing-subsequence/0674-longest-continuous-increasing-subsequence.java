class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        if(n==1){
            return 1;
        }
        int left=0;
        int max_len=1;
        for(int right=1;right<n;right++){
            if(nums[right]>nums[right-1]){
                max_len++;
            }
            else{
                max_len=1;
            }
            if(max_len>left){
                left=max_len;
            }
        }
        return left;
    }
}