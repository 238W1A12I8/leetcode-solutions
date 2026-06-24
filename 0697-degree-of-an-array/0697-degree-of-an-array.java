class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxi=Integer.MIN_VALUE;
        for(int j:map.keySet()){
            maxi=Math.max(maxi,map.get(j));
        }
        Map<Integer,Integer> map1=new HashMap<>();
        int win=Integer.MIN_VALUE;
        int ans=Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<nums.length){
            map1.put(nums[j],map1.getOrDefault(nums[j],0)+1);
            win=Math.max(win,map1.get(nums[j]));
            while(win==maxi){
                ans=Math.min(ans,j-i+1);
                map1.put(nums[i],map1.get(nums[i])-1);
                if(map1.get(nums[i])==0){
                    map1.remove(nums[i]);
                }
                if(nums[i]==nums[j]){
                    win--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}