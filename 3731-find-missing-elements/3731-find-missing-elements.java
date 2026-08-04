class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        int freq[]=new int[max+1];
        for(int num:nums){
            freq[num]++;
        }
        for(int i=min;i<max;i++){
            if(freq[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}