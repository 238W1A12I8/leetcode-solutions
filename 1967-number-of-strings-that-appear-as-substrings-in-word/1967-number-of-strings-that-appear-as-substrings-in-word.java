class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String st:patterns){
            if(word.contains(st)){
                count=count+1;
            }
        }
        return count;
    }
}