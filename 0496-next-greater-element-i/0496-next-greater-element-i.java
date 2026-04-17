class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int[] ans = new int[m];
        int n = nums2.length;
        for (int i = 0; i < m; i++) {
            int a = nums1[i];
            int j = 0;
            while (nums2[j] != a) {
                j++;
            }
            int ng = -1;
            for (int k = j + 1; k < n; k++) {
                if (nums2[k] > a) {
                    ng = nums2[k];
                    break;
                }
            }
            ans[i] = ng;
        }
        return ans;
    }
}