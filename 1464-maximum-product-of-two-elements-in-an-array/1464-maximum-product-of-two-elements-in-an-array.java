class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int fst=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>fst){
                sec=fst;
                fst=nums[i];
            }
            else if(nums[i]>sec){
                sec=nums[i];
            }
        }
        System.out.print(fst+" "+sec);
        return (fst-1)*(sec-1);
    }
}