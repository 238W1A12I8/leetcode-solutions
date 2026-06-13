class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int a : asteroids) {
            boolean flag = false;
            while (!st.isEmpty() && st.peek() > 0 && a < 0) {
                if (st.peek() < -a) {
                    st.pop();
                } else if (st.peek() == -a) {
                    st.pop();
                    flag = true;
                    break;
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                st.push(a);
            }
        }
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
}