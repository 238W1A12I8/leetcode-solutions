class Solution {
    public String getHint(String secret, String guess) {
        int n=guess.length();
        int b=0;
        int c=0;
        int fre[]=new int[10];
        for(int i=0;i<secret.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g){
                b=b+1;
            }
            else{
                int ss=s-'0';
                int gg=g-'0';
                if(fre[ss]<0) c++;
                if(fre[gg]>0) c++;
                fre[ss]++;
                fre[gg]--;
            }
        }
        return b+"A"+c+"B";
    }
}