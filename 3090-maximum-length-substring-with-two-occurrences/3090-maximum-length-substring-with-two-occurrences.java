class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int left=0;
        int maxLen=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int right=0;right<n;right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(s.charAt(right))>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}