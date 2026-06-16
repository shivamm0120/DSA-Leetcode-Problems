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
    public ListNode oddEvenList(ListNode head) {
        if(head==null ||head.next==null||head.next.next==null)return head;
        ListNode odd= head;

        ListNode even=head.next;
        ListNode firstEven=head.next;

        boolean oddValid=  (odd!=null && odd.next!=null);
        boolean evenValid= (even!=null && even.next!=null);

        while(oddValid && evenValid){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
            
            oddValid=  (odd!=null && odd.next!=null);
            evenValid= (even!=null && even.next!=null);

        }
        if(even!=null)even.next=null;
        odd.next=firstEven;
        return head;
    }
}