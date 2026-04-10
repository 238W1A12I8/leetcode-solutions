class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxsum=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        System.out.println(sum);
        maxsum=sum;
        for(int i=k;i<n;i++){
            sum=sum+nums[i]-nums[i-k];
            System.out.println(sum);
            if(maxsum<sum){
                maxsum=sum;
            }
        }
        return maxsum/k;
    }
}