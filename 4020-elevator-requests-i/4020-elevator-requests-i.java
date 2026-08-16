class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int m=requests.length;
        int cur=0;
        int totaltime=0;
        for(int i=0;i<m;i++){
            totaltime+=Math.abs(cur-requests[i]);
            cur=requests[i];
        }
        return totaltime;
    }
}