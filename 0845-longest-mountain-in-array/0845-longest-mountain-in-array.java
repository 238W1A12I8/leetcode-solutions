class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        if(n<3) return 0;
        int left=0;
        int sum=0;
        while(left<n-2)
        {
            while(left<n-1 && arr[left]>=arr[left+1]){
                left++;
            }
            int up=left;
            while(up<n-1 && arr[up]<arr[up+1]) up++;
            int down=up;
            while(down<n-1 && arr[down]>arr[down+1]) down++;
            if(up!=left && down!=up){
                sum=Math.max(sum,down-left+1);
            }
            left=Math.max(down,left+1);
        }
        return sum;
    }
}