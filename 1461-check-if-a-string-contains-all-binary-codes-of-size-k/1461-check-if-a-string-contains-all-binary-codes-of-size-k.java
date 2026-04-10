class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        Set<String> set=new HashSet<>();
        int target=1<<k; // 2^k
        for(int i=0;i<n-k+1;i++){
            String substring=s.substring(i,i+k);
            set.add(substring);
            if(set.size()==target){
                return true;
            }
        }
        return set.size()==target;
    }
}