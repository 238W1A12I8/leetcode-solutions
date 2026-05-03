class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=nums.length;
        int ans=0;
        int freq[]=new int[56];
        for(int num:nums){
            freq[num]++;
            if(freq[num]==2){
                ans=ans^num;
            }
        }
        return ans;
    }
}