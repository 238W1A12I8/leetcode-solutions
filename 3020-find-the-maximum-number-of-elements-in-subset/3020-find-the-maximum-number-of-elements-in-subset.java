class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        Map<Long,Integer> map=new HashMap<>();
        int cOne=0;
        for(long num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(num==1) cOne++;
        }
        if(cOne==n) return n%2==0?n-1:n;
        cOne=cOne%2==0?cOne-1:cOne;
        for(long key:map.keySet()){
            if(key==1) continue;
            int length=1;
            while(map.containsKey(key*key) && map.get(key)>1){
                key=key*key;
                length+=2;
            }
            cOne=Math.max(cOne,length);
        }
        return cOne;
    }
}