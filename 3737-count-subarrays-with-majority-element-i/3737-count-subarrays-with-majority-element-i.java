class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int prefix[]=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+(nums[i]==target?1:-1);
        }
        int res=0;
        for(int l=0;l<n;l++){
            for(int r=l;r<n;r++){
                if(prefix[r+1]-prefix[l]>0){
                    res++;
                }
            }
        }
        return res;
    }
}