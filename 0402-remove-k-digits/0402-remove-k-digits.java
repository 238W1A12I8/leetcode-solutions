class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==2 && k==2) return "0";
        int n=num.length();
        Stack<Character> st=new Stack();
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder str=new StringBuilder();
        for(char ch:st){
            str.append(ch);
        }
        while(str.length()>0 && str.charAt(0)=='0'){
            str.deleteCharAt(0);
        }
        if(str.length()==0) return "0";
        return str.toString();
    }
}