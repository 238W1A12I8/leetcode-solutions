class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        int tar=k*threshold;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum>=tar){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum+=arr[i]-arr[i-k];
            if(sum>=tar){
                count=count+1;
            }
        }
        return count;
    }
}