class Solution {
    public String addStrings(String num1, String num2) {
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        if(num1.equals("0") && num2.equals("0"))  return "0";
        StringBuilder ans=new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            int m=(i>=0) ? num1.charAt(i)-'0':0;
            int n=(j>=0)? num2.charAt(j)-'0':0;
            int sum=m+n+carry;
            ans.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}