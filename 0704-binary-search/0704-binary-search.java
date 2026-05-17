class Solution {
    public int search(int[] nums, int target) {
        boolean flag=false;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                flag=true;
                ans=i;
                return ans;
            }
        }
        return -1;
    }
}