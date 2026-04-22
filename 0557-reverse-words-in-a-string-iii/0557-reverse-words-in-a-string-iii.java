class Solution {
    public String reverseWords(String s) {
        String w[]=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(String s1:w){
            str.append(new StringBuilder(s1).reverse()).append(" ");
        }
        return str.toString().trim();
    }
}