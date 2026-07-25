class Solution {
    public int maxProduct(int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(n>0){
            pq.offer(n%10);
            n=n/10;
        }
        int max1=pq.poll();
        int max2=pq.poll();
        return max1*max2;
    }
}