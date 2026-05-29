class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        for(int num:nums){
            int sum=0;
            while(num>0)
            {
            sum=sum+num%10;
            num=num/10;
            }
            res=Math.min(res,sum);
        }
        return res;
    }
}