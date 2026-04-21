class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid=getMid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
    public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode list=new ListNode(-1);
        ListNode temp=list;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null) temp.next=l1;
        if(l2!=null) temp.next=l2;
        return list.next;
    }
}