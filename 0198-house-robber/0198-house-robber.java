class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2){
            return Math.max(nums[0],nums[1]);
        }
        int sec=nums[0];
        int rob=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int temp=Math.max(rob,sec+nums[i]);
            sec=rob;
            rob=temp;
        }
        return rob;
    }
}