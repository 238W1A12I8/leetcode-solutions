class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int left=0;
        int right=1;
        for(int num:nums){
            if(num%2==0){
                res[left]=num;
                left+=2;
            }
            else{
                res[right]=num;
                right+=2;
            }
        }
        return res;
    }
}