class Solution {
    public int calculate(String s) {
        int n=s.length();
        int num=0;
        char op='+';
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            if(isOperator(ch)||i==s.length()-1){
                if(op=='+') st.push(num);
                else if(op=='-') st.push(-num);
                else if(op=='*') st.push(st.pop()*num);
                else if(op=='/') st.push(st.pop()/num);
                num=0;
                op=ch;
            }
        }
        int res=0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        return res;
    }
    private boolean isOperator(char ch){
        return ch=='+'||ch=='-'||ch=='*'||ch=='/';
    }
}