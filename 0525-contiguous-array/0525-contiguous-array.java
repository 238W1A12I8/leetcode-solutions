class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int sum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=nums[i]==0?-1:1;
            if(sum==0) count=i+1;
            else if(map.containsKey(sum)) count=Math.max(count,i-map.get(sum));
            else map.put(sum,i);
        }
        return count;
    }
}