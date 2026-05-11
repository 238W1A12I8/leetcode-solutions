class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n];
        for(int num : nums){
            freq[ num ]++;
        }
        int idx=0;
        for(int i = 0; i<3 ; i++){
            for(int j =0; j<freq[i]; j++){
                nums[idx++] = i ;
            }
        }
    }
}