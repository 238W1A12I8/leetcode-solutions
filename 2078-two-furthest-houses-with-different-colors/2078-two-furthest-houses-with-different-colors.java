class Solution {
    public int maxDistance(int[] A) {
        int n=A.length;
        for(int i=0;i<n;i++){
            if(A[i]!=A[n-1] || A[n-1-i]!=A[0]) return n-1-i;
        }
        return 0;
    }
}