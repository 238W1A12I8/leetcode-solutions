import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int m = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[m];
        Arrays.fill(ans, -1);
        for (int i = 0; i < 2 * m; i++) {
            int a = nums[i % m];
            while (!st.isEmpty() && nums[st.peek()] < a) {
                ans[st.pop()] = a;
            }
            if (i < m) {
                st.push(i);
            }
        }
        return ans;
    }
}