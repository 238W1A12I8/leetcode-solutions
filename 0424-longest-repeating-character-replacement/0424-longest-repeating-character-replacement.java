class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int i=0;
        int freq[]=new int[26];
        int ans=0;
        int maxFre=0;
        for(int j=0;j<n;j++){
            freq[s.charAt(j)-'A']++;
            maxFre=Math.max(maxFre,freq[s.charAt(j)-'A']);
            while((j-i+1)-maxFre>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(ans,(j-i+1));
        }
        return ans;
    }
}