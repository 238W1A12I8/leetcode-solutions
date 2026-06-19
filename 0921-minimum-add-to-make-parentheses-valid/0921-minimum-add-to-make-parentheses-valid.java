class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int min=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    min++;
                }
            }
        }
        return min+st.size();
    }
}