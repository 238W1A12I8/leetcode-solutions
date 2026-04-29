class Solution {
    public int longestSubstring(String s, int k) {
        return dnc(s,0,s.length(),k);
    }
    public int dnc(String s,int st,int end,int k){
        if(end-st<k) return 0;
        int n=s.length();
        int freq[]=new int[26];
        for(int i=st;i<end;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=st;i<end;i++){
            if(freq[s.charAt(i)-'a']<k){
                int j=i+1;
                while(j<end && freq[s.charAt(i)-'a']<k) j++;
                return Math.max(dnc(s,st,i,k),dnc(s,j,end,k));
            }
        }
        return end-st;
    }
}