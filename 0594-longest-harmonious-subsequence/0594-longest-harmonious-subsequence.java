class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(map.containsKey(num+1)){
                ans=Math.max(ans,map.get(num)+map.get(num+1));
            }
        }
        return ans;
    }
}