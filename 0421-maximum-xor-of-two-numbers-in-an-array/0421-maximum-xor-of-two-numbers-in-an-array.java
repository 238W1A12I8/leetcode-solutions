class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0;
        int mask=0;
        int n=nums.length;
        for(int i=31;i>=0;i--){
            mask=mask | (1<<i);
            HashSet<Integer> set=new HashSet<>();
            for(int num:nums){
                set.add(num & mask);
            }
            int temp=max | (1<<i);
            for(int pre:set){
                if(set.contains(pre^temp)){
                    max=temp;
                    break;
                }
            }
        }
        return max;
    }
}