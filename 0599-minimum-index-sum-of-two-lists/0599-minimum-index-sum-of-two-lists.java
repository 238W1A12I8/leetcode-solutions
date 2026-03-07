class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        int minSum=Integer.MAX_VALUE;
        List<String> ans=new ArrayList<>();
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                int sum=i+map.get(list2[i]);
                if(sum<minSum){
                    ans.clear();
                    ans.add(list2[i]);
                    minSum=sum;
                }
                else if(minSum==sum){
                    ans.add(list2[i]);
                }
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}