class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        int k=s1.length();
        if(k>s2.length()){
            return false;
        }
        for(char ch:s1.toCharArray()){
            freq1[ch-'a']++;
        }
        for(int i=0;i<k;i++){
            freq2[s2.charAt(i)-'a']++;
        }
        if(Permutation(freq1,freq2)){
            return true;
        }
        for(int i=k;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++; // new character
            freq2[s2.charAt(i-k)-'a']--; // removing old character
            if(Permutation(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
    public boolean Permutation(int a[],int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}