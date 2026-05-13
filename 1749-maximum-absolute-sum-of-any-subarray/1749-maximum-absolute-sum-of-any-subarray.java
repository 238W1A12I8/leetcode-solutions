class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        int currmax=nums[0];
        int currmin=nums[0];
        for(int i=1;i<n;i++){
            currmax=Math.max(nums[i]+currmax,nums[i]);
            max=Math.max(currmax,max);
        }
        for(int i=1;i<n;i++){
            currmin=Math.min(currmin+nums[i],nums[i]);
            min=Math.min(currmin,min);
        }
        return Math.max(max,Math.abs(min));
    }
}