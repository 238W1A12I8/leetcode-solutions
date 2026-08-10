class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int m=aliceSizes.length;
        int n=bobSizes.length;
        int sum1=0,sum2=0;
        for(int a:aliceSizes){
            sum1+=a;
        }
        for(int b:bobSizes){
            sum2+=b;
        }
        int dif=(sum2-sum1)/2;
        Set<Integer> set=new HashSet<>();
        for(int b:bobSizes){
            set.add(b);
        }
        for(int a:aliceSizes){
            if(set.contains(a+dif)){
                return new int[]{a,a+dif};
            }
        }
        return new int[]{};
    }
}