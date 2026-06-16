import java.util.Stack;
class Solution {
    public int evalRPN(String[] tokens) {
        int x, y;
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                st.push(st.pop() + st.pop());
            } 
            else if (s.equals("/")) {
                y = st.pop();
                x = st.pop();
                st.push(x / y);
            } 
            else if (s.equals("*")) {
                st.push(st.pop() * st.pop());
            } 
            else if (s.equals("-")) {
                y = st.pop();
                x = st.pop();
                st.push(x - y);
            } 
            else {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}