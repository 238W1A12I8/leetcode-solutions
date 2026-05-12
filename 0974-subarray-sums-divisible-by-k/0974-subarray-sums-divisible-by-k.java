class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            int r=sum%k;
            if(r<0) r=r+k;
            count+=map.getOrDefault(r,0);
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return count;
    }
}