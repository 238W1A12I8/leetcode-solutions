class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(List<Integer> v:map.values()){
            if(v.size()>=3){
                for(int i=0;i<=v.size()-3;i++){
                   int dist = Math.abs(v.get(i) - v.get(i + 1))
                            + Math.abs(v.get(i) - v.get(i + 2))
                            + Math.abs(v.get(i + 1) - v.get(i + 2));
                    ans=Math.min(ans,dist);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}