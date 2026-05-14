class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.equals(" ") || s.isEmpty()){
            return true;
        }
        s=s.trim();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if(left < right){
                char a=Character.toLowerCase(s.charAt(left));
                char b=Character.toLowerCase(s.charAt(right));
                if(a!=b) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}