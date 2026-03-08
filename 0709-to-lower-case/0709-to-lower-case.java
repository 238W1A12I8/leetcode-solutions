class Solution {
    public String toLowerCase(String s) {
        char ss[]=s.toCharArray();
        StringBuilder str=new StringBuilder();
        for(int i=0;i<ss.length;i++){
            if(ss[i]>='A' && ss[i]<='Z'){
                ss[i]=(char)(ss[i]+32);
            }
            str.append(ss[i]);
        }
        return str.toString();
    }
}