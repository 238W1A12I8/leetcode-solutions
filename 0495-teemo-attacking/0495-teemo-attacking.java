class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n=timeSeries.length;
        if(n==0) return 0;
        int ans=duration;
        for(int j=1;j<n;j++){
            ans+=Math.min(duration,timeSeries[j]-timeSeries[j-1]);
        }
        return ans;
    }
}