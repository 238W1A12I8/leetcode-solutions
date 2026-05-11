class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int count=0;
        int max=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                count=count+1;   
            }
            while(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
            max=Math.max(max,r-left+1);
        }
        System.out.print(max);
        return max;
    }
}