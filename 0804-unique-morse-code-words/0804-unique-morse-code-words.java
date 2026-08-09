class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String tab[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String w:words){
            StringBuilder str=new StringBuilder();
            for(char ch:w.toCharArray()){
                str.append(tab[ch-'a']);
            }
            set.add(str.toString());
        }
        return set.size();
    }
}