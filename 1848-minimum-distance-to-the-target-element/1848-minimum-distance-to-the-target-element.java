class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                int res=Math.abs(i-start);
                map.put(i,res);
            }
        }
        return Collections.min(map.values());
    }
}