class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int m=g.length;
        int n=s.length;
        int max=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<m && j<n){
                if(s[j]>=g[i]){
                    i++;
                    max++;
                }
                j++;
        }
        return max;
    }
}