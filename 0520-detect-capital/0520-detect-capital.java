class Solution {
    public boolean detectCapitalUse(String word) {
        int  n= word.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
                count=count+1;
            }
        }
        if(count==n) return true;
        if(count==0) return true;
        if(count==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }
        return false;
    }
}