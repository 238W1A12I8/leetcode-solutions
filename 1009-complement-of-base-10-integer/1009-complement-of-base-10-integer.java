class Solution {
    public int bitwiseComplement(int n) {
         String str=Integer.toBinaryString(n);
        String st="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                st+='1';
            }
            else{
                st+='0';
            }
        }
        return Integer.parseInt(st,2);
    }
}