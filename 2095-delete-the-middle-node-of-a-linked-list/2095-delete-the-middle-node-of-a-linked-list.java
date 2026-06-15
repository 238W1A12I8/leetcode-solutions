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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count=count+1;
            temp=temp.next;
        }
        temp=head;
        int n=count;
        int middle=n/2;
        for(int i=0;i<middle-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}