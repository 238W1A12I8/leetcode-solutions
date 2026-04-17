class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int m=nums.length;
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[m];
        Arrays.fill(ans,-1);
        for(int i=2*m-1;i>=0;i--){
            int a=nums[i%m];
            while(!st.isEmpty() && st.peek()<=a){
                st.pop();
            }
            if (i < m) {
                if (!st.isEmpty()) {
                    ans[i] = st.peek();
                }
            }
            st.push(a);
        }
        return ans;
    }
}