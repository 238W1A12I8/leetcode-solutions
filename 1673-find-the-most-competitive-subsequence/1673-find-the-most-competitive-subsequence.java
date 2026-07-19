class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int n=nums.length;
        Stack<Integer> st=new Stack();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() &&
            st.peek()>nums[i] && st.size()+(n-i)>k){
                st.pop();
            }
            if(st.size()<k){
               st.push(nums[i]);
            }
        }
        int res[]=new int[k];
        for(int i=k-1;i>=0;i--){
            res[i]=st.pop();
        }
        return res;
    }
}