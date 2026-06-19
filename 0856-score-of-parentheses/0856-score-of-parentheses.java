class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(-1);
            }
            else{
                int curr=0;
                while(st.peek()!=-1){
                    curr+=st.pop();
                }
                st.pop();
                st.push(curr==0?1:2*curr);
            }
        }
        int sc=0;
        while(!st.isEmpty()){
            sc+=st.pop();
        }
        return sc;
    }
}