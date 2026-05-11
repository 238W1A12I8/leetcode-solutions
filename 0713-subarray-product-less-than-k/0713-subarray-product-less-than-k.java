class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        if(k<=1){
            return 0;
        }
        int left=0;
        int prod=1;
        int count=0;
        int right=0;
        while(right<n){
            prod*=nums[right];
            while(prod>=k){
                prod=prod/nums[left++];
            }
            count+=1+(right-left);
            right++;
        }
        return count;
    }
}