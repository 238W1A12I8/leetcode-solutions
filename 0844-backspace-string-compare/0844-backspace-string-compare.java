class Solution {
    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }
    public String helper(String st){
        Stack<Character> stack=new Stack<>();
        for(char ch:st.toCharArray()){
            if(ch=='#'){
              if(!stack.isEmpty()){
                stack.pop();
              }
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.toString();
    }
}