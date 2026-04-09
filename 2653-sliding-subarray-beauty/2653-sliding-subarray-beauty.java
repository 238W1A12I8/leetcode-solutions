class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        int freq[]=new int[101];
        for(int i=0;i<k;i++){
            freq[nums[i]+50]++;
        }
        for(int i=0;i<=n-k;i++){
            int c=0;
            int b=0;
            for(int j=0;j<50;j++){
                c+=freq[j];
                if(c>=x){
                    b=j-50;
                    break;
                }
            }
            res[i]=b;
            if(i+k<n){
                freq[nums[i]+50]--;
                freq[nums[i+k]+50]++;
            }
        }
        return res;
    }
}