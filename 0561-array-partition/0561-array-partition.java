class Solution {
    public int arrayPairSum(int[] nums) {
        int count[]=new int[20001];
        int n=nums.length;
        for(int i=0;i<n;i++){
             count[nums[i] + 10000]++;
        }
        boolean flag=true;
        int sum=0;
        for(int i=0;i<count.length;i++){
        if(count[i]>0){
            while(count[i]>0){
                if(flag){
                    sum+=i-10000;
                }
                flag=!flag;
                count[i]--;
            }
        }
        }
        return sum;
    }
}