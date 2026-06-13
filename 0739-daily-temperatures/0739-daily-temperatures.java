class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st=new Stack<>();
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            int num=temperatures[i];
            while(!st.isEmpty() && temperatures[st.peek()]<num){
                res[st.peek()]=i-st.pop();
            }
            st.push(i);
        }
        return res;
    }
}