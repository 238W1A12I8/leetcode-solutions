class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        } 
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}