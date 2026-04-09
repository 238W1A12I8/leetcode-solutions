class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0;
        int r=cardPoints.length-1;
        int sum=0;
        for(int i=l; i<=k-1; i++) sum+=cardPoints[i];
        int maxsum=sum;
        for(int i=k-1; i>=0; i--){
            sum-=cardPoints[i];
            sum+=cardPoints[r];
            r--;
            maxsum=(int)Math.max(maxsum, sum);
        }
        return maxsum;
    }
}