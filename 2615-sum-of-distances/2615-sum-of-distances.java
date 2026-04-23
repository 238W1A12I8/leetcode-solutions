class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long res[]=new long[n];
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        for(List<Integer> list:map.values()){
            long total=0;
            for(int x:list){
                total+=x;
            }
            long prefix=0;
            for(int k=0;k<list.size();k++){
                int i=list.get(k);
                long l=(long)i*k-prefix;
                long r=(total-prefix-i)-(long)i*(list.size()-k-1);
                res[i]=l+r;
                prefix+=i;
            }
        }
        return res;
    }
}