class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int temp[]=Arrays.copyOf(arr,n);
        Arrays.sort(temp);
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:temp){
            if(!map.containsKey(num)){
                map.put(num,rank++);
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}