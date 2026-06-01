class Solution {
    public int minimumCost(int[] cost) {
        int n = cost.length;
        Arrays.sort(cost);
        if (n == 2) {
            return cost[0] + cost[1];
        }
        int total = 0;
        for (int i = 0; i < cost.length; i += 3) {
            total += cost[n - 1 - i];
            if (i + 1 < n) {
                total += cost[n - 1 - (i + 1)];
            }
        }
        return total;
    }
}