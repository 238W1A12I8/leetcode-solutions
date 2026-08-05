class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[2];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(map.containsKey(nums[i]) && map.containsKey(nums[j])){
                    if(nums[i]+nums[j]==target){
                        ans[0]=i;
                        ans[1]=j;
                    }
                }
            }
        }
        return ans;
    }
}