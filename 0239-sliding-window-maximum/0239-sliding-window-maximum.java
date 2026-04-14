class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> lst=new ArrayList<>();
        int max=Integer.MAX_VALUE;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
            max=Math.max(nums[i],0);
            lst.add(sum);
        } 
        max=sum;
        for(int i=k;i<n;i++){
            sum=sum+nums[i]-nums[i-k];
            max=Math.max(nums[i],0);
            lst.add(max);
        }
        return lst;
    }
}