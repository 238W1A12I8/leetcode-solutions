class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int count=1;
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx]=-nums[idx];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
    }
}