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
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null)return head;
        
        ListNode dummy = new ListNode(-1);
        ListNode prev=dummy;
        ListNode curr=head;

        while(curr!=null){
           ListNode forw=curr.next;
           if(forw==null)return dummy.next;//when only 1 nodes remain to swap

            prev.next=forw;
            curr.next=forw.next;
            forw.next=curr;

            prev=curr;
            curr=curr.next;

        }
        return dummy.next;
        
    }
}