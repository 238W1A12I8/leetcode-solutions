class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            int m=list.size();
            for(int j=0;j<m;j++){
                List<Integer> t=new ArrayList<>(list.get(j));
                t.add(nums[i]);
                list.add(t);
            }
        }
        return list;
    }
}