class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        long current_sum=0;
        long max_sum=0;
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            current_sum+=nums[i];
        }
        if(map.size()==k){
            max_sum=current_sum;
        }
        for(int i=k;i<n;i++){
            int prev=nums[i-k];
            map.put(prev,map.get(prev)-1);
            if(map.get(prev)==0){
                map.remove(prev);
            }
            current_sum-=prev;
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            current_sum+=nums[i];
            if(map.size()==k) max_sum=Math.max(max_sum,current_sum);
        }
        return max_sum;
    }
}