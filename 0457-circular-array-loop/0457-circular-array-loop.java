class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> set=new HashSet<>();
            int cur=i;
            boolean num=nums[i]>0;
            while(true){
                if((nums[cur]>0)!=num) break;
                if(set.contains(cur)){
                    if(set.size()>1) return true;
                    else break;
                }
                set.add(cur);
                int nex=((cur+nums[cur])%n+n)%n;
                if(nex==cur) break;
                cur=nex;
            }
        }
        return false;
    }
}