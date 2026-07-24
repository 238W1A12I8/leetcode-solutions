class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int total=n*(n+1)/2;
        int sum1=0;
        int sum2=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            sum1+=num;
        }
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            sum2+=num;
        }
        int mis=total-sum2;
        int dup=sum1-sum2;
        return new int[]{dup,mis};
    }
}