class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)){
            Map<Character,Integer> map=new HashMap<>();
            for(char ch:s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)>1){
                    return true;
                }
            }
            return false;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                list.add(i);
            }
        }
        if(list.size()!=2){
            return false;
        }
        int m=list.get(0);
        int n=list.get(1);
        System.out.println(s);
        return s.charAt(m)==goal.charAt(n) && s.charAt(n)==goal.charAt(m);
    }
}