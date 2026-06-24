class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        int count=1;
        for(int i=0;i<n;i++){
            while(count<nums[i]){
                list.add(count);
                count++;
            }
            if(nums[i]==count){
                count+=1;
            }
        }
        while(count<=n){
            list.add(count);
            count++;
        }
        return list;
    }
}