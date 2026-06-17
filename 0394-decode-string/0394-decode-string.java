class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums=new Stack<>();
        Stack<StringBuilder> st=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else if(ch=='['){
                nums.push(num);
                st.push(curr);
                curr=new StringBuilder();
                num=0;
            }else if(ch==']'){
                int k=nums.pop();
                StringBuilder prev=st.pop();
                while(k-->0){
                    prev.append(curr);
                }
                curr=prev;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}