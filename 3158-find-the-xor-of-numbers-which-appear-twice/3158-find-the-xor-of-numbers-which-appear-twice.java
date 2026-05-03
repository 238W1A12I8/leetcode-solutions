class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==2){
                ans=ans^num;
            }
        }
        return ans;
    }
}