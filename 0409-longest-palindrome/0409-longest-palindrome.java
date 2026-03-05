class Solution {
    public int longestPalindrome(String s) {
        char ss[]=s.toCharArray();
        Arrays.sort(ss);
        int left=0;
        int right=1;
        boolean found=false;
        int length=0;
        while(right<ss.length){
            if(ss[left]==ss[right]){
                length+=2;
                left=right+1;
                right=left+1;
            }
            else{
                found=true;
                left++;
                right++;
            }
        }
        if(left<ss.length) found=true;
        if(found) length+=1;
        return length;

    }
}