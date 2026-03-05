class Solution {
    public int longestPalindrome(String s) {
        char ss[]=s.toCharArray();
        int count=0;
        Set<Character> set=new HashSet<>();
        for(int i=0;i<ss.length;i++){
            if(set.contains(ss[i])){
                set.remove(ss[i]);
                count+=2;
            }
            else{
                set.add(ss[i]);
            }
        }
        if(!set.isEmpty()){
            count+=1;
        }
        return count;
    }
}