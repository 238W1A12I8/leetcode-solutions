class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int f=arr[i];
                int s=arr[j];
                int c=2;
                while(set.contains(f+s)){
                    c++;
                    int tem=f+s;
                    f=s;
                    s=tem;
                }
                if(c>=3){
                    ans=Math.max(ans,c);
                }
            }
        }
        return ans;
    }
}