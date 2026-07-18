class Solution {
    public int heightChecker(int[] heights) {
        int nums[]=heights.clone();
        Arrays.sort(nums);
        int n=heights.length;
        int m=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=nums[i]){
                count=count+1;
            }
            if(heights[i]==nums[i]){
                continue;
            }
        }
        return count;
    }
}