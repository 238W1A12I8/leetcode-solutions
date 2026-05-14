class Solution {
    int count=0;
    public int countSubstrings(String s) {
        if(s.length()==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            checkPalin(s,i,i);
            checkPalin(s,i,i+1);
        }
        return count;
    }
    private void checkPalin(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            count++;
            i--;
            j++;
        }
    }
}