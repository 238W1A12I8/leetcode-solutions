class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int freq[]=new int[128];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }
        int left=0;
        int right=0;
        int count=t.length();
        int minLen=Integer.MAX_VALUE;
        int st=0;
        StringBuilder str=new StringBuilder();
        for(right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;
            while(count==0){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    st=left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    count++;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE? "":s.substring(st,st+minLen);
    }
}