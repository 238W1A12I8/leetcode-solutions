class Solution {
    public int diff(String a,String b){
        int n=a.length();
        int sa=0;
        for(int i=0;i<n;i++){
            if(a.charAt(i)==b.charAt(i)){
                sa=sa+1;
            }
        }
        return n-sa;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list=new ArrayList<>();
        for(String q:queries){
            for(String d:dictionary){
                int dif=diff(q,d);
                if(dif<=2){
                    list.add(q);
                    break;
                }
            }
        }
        return list;
    }
}