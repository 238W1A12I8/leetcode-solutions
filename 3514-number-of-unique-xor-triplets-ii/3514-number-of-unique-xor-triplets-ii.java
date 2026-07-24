class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int mx=2048;
        int n=nums.length;
        boolean xor[]=new boolean[mx];
        boolean tri[]=new boolean[mx];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                xor[nums[i]^nums[j]]=true;
            }
        }
        for(int k=0;k<mx;k++){
            if(!xor[k]) continue;
            for(int num:nums){
                tri[k^num]=true;
            }
        }
        int count=0;
        for(boolean nu:tri){
            if(nu) count++;
        }
        return count;
    }
}