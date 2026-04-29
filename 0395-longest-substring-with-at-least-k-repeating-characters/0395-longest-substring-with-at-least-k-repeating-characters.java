class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.get(ch)<k)
            {
                int left=longestSubstring(s.substring(0,i),k);
                int rig=longestSubstring(s.substring(i+1),k);
                return Math.max(left,rig);
            }
        }
        return s.length();
    }
}