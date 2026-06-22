/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       if(head==null) return null;
       ListNode prev=null;
       ListNode temp=head;
       ListNode temp1=temp.next;
       while(temp!=null){
        temp.next=prev;
        prev=temp;
        temp=temp1;
        if(temp1!=null){
            temp1=temp1.next;
        }
       }
        return prev;
    }
}