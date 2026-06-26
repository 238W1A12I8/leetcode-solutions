class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        long count=0;
        int prefix[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                nums[i]=1;
            }else{
                nums[i]=-1;
            }
        }
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int temp=n;
        int freq[]=new int[2*n+1];
        freq[temp]=1;
        long va=0;
        int lsum=0;
        for(int i=0;i<n;i++){
            if(prefix[i]>lsum){
                va+=freq[lsum+temp];
            }else{
                va-=freq[prefix[i]+temp];
            }
            count+=va;
            freq[prefix[i]+temp]++;
            lsum=prefix[i];
        }
        return count;
    }
}