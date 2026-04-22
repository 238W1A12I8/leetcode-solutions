class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ev=0;
        int od=nums.length-1;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[ev++]=nums[i];
            }
            else{
                res[od--]=nums[i];
            }
        }
        return res;
    }
}