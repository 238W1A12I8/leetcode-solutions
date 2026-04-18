class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count=count+1;
            temp=temp.next;
        }
        int h[]=new int[count];
        temp=head;
        int i=0;
        while(temp!=null){
            h[i]=temp.val;
            temp=temp.next;
            i++;
        }
        int l=0;
        int r=h.length-1;
        while(l<r){
            if(h[l]!=h[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}