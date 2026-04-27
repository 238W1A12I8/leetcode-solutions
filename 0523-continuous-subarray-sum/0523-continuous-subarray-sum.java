class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int[] prefix=new int[n+1];
        Map<Integer,Integer> map=new HashMap<>();
        prefix[0]=0;
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        for(int i=0;i<=n;i++){
            int r=prefix[i]%k;
            if(r<0) r=r+k;
            if(map.containsKey(r)){
                if(i-map.get(r)>=2){
                    return true;
                }
            } else{
                map.put(r,i);
            }
        }
        return false;
    }
}