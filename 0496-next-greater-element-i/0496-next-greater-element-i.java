class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        Map<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int num=nums2[i];
            while(!st.isEmpty() && st.peek()<=num){
                st.pop();
            }
            map.put(num, st.isEmpty() ? -1 : st.peek());
            st.push(num);
        }
        int res[]=new int[m];
        for(int i=0;i<m;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}