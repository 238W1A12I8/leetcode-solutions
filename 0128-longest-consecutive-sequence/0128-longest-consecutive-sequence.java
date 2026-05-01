class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int max=0;
        Arrays.sort(nums);
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int c=1;
                while(set.contains(num+c)){
                    c=c+1;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
}