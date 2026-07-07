class Solution {
    public long sumAndMultiply(int n) {
        String str=String.valueOf(n);
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='0'){
                s.append(ch);
            }
        }
        if(s.length()==0){
            return 0;
        }
        long sum=Long.parseLong(s.toString());
        long temp=sum;
        long digit=0;
        while(temp>0){
            digit+=temp%10;
            temp=temp/10;
        }
        return (long) sum*digit;
    }
}