class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int extraCandies) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+extraCandies;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}