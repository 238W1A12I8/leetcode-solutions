class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1,lm=0,rm=0,tra=0;
        while(l<r){
            lm=Math.max(lm,height[l]);
            rm=Math.max(rm,height[r]);
            if(lm<rm){
                tra+=lm-height[l];
                l++;
            }
            else{
                tra+=rm-height[r];
                r--;
            }
        }
        return tra;
    }
}