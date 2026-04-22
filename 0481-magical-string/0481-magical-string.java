class Solution {
    public int magicalString(int n) {
        if(n==1) return 1;
        if(n<=3) return 1;
        StringBuilder st=new StringBuilder("122");
        int p1=2;
        int p2=st.length();
        while(st.length()<n){
            if(st.charAt(p1)=='1'){
                if(st.charAt(p2-1)=='1'){
                    st.append(2);
                }
                else{
                    st.append(1);
                }
                p2++;
            }
            else{
                if(st.charAt(p2-1)=='2'){
                    st.append(11);
                }else{
                    st.append(22);
                }
                p2+=2;
            }
            p1++;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(st.charAt(i)=='1'){
                count=count+1;
            }
        }
        return count;
    }
}