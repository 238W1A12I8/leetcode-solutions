class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0;
        boolean flag=false;
        for(int num:nums){
            flag|=num>0;
            xor^=num;
        }
        if(!flag) return 0;
        return xor==0?n-1:n;
        
    }
}