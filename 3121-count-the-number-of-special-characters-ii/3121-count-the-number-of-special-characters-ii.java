class Solution {
    public int numberOfSpecialChars(String word) {
        int lower[]=new int[26];
        int higher[]=new int[26];
        Arrays.fill(lower,-1);
        Arrays.fill(higher,-1);
        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z'){
                lower[ch-'a']=i;
            }
            else{
                if(higher[ch-'A']==-1){
                    higher[ch-'A']=i;
                }
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(lower[i]!=-1 && higher[i]!=-1 && lower[i]<higher[i]){
                count=count+1;
            }
        }
        return count;
    }
}