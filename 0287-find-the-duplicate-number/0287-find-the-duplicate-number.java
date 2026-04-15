class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<n+1;i++){
            if(freq[i]>=2){
                ans=i;
            }
        }
        return ans;
    }
}