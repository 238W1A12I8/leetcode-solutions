class Solution {
    public void reverseString(char[] s) {
        StringBuilder st=new StringBuilder();
        for(char i:s){
            st.append(i);
        }
        st.reverse();
        for (int i = 0; i < s.length; i++) {
            s[i] = st.charAt(i);
        }
    }
}