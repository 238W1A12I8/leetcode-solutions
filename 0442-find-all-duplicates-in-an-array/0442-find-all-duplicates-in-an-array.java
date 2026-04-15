class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)>1){
                list.add(k);
            }
        }
        return list;
    }
}