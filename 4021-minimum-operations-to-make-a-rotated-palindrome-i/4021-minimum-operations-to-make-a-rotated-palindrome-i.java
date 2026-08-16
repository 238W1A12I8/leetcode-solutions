class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int minOp=300000;
        for(int i=0;i<n;i++){
            int tem=i;
            String str=s.substring(i)+s.substring(0,i);
            for(int j=0;j<n/2;j++){
                char x=str.charAt(j);
                char y=str.charAt(n-1-j);
                int z=Math.abs(x-y);
                tem+=Math.min(z,26-z);
            }
            minOp=Math.min(minOp,tem);
        }
        return minOp;
    }
}