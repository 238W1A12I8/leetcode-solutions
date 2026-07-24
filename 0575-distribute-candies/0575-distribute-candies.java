class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(candyType[i]);
        }
        return Math.min((int)n/2,(int)set.size());
    }
}