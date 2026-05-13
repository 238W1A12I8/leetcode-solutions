class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int currmax=nums[0];
        int currmin=nums[0];
        int total=nums[0];
        for(int i=1; i<nums.length; i++){
            currmax=Math.max(nums[i]+currmax,nums[i]);
            max=Math.max(currmax,max);
            currmin=Math.min(nums[i]+currmin,nums[i]);
            min=Math.min(currmin,min);
            total+=nums[i];
        }
        int cirsum=total-min;
        if(cirsum==0){
            return max;
        }
        return Math.max(max,cirsum);
    }
}