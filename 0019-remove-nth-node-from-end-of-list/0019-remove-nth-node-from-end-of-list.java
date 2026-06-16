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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
        ListNode forward=head;
        ListNode prev=head;
        while(n>0){
            forward=forward.next;
            n--;
        }
        if(forward==null)return prev.next;
        while(forward.next!=null){
            forward=forward.next;
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
        
    }
}