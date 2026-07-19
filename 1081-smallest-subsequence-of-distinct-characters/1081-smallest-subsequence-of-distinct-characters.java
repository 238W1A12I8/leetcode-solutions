class Solution {
    public String smallestSubsequence(String s) {
        int n=s.length();
        int freq[]=new int[26];
        boolean seen[]=new boolean[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        } 
        Stack<Character> st=new Stack();
        for(char ch:s.toCharArray()){
            freq[ch-'a']--;
            if(seen[ch-'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch && freq[st.peek()-'a']>0){
                seen[st.pop()-'a']=false;
            }
            st.push(ch);
            seen[ch-'a']=true;
        }
        StringBuilder str=new StringBuilder();
        for(char ch:st){
            str.append(ch);
        }
        return str.toString();
    }
}