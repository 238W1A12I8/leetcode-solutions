class Solution {
    public boolean digitCount(String num) {
        int n=num.length();
        int freq[]=new int[10];
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            freq[ch-'0']++;
        }
        for(int i=0;i<n;i++){
            if(freq[i]!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}