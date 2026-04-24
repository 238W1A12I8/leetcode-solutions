class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<moves.length();i++){
            map.put(moves.charAt(i),map.getOrDefault(moves.charAt(i),0)+1);
        }
        int l=0;
        int r=0;
        if(map.containsKey('L')) l=map.get('L');
        if(map.containsKey('R')) r=map.get('R');
        int u=0;
        if(map.containsKey('_')) u=map.get('_');
        return Math.abs(l-r)+u;
    }
}