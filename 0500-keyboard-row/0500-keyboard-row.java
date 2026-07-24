class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiop";
        String s2="asdfghjkl";
        String s3="zxcvbnm";
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            boolean inf=true,ins=true,inth=true;
            for(int j=0;j<word.length();j++){
                char ch=word.charAt(j);
                if(s1.indexOf(ch)==-1){
                    inf=false;
                }
                if(s2.indexOf(ch)==-1){
                    ins=false;
                }
                if(s3.indexOf(ch)==-1){
                    inth=false;
                }
            }
            if(inf||ins||inth){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}