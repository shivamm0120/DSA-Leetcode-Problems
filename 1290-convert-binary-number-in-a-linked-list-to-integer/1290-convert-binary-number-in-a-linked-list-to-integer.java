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
    public int getDecimalValue(ListNode head) {
        head=reverse(head);
        if(head.next==null)return head.val;
        ListNode temp=head;int place=1;
        int value=0;

        while(temp!=null){
            value+=temp.val*place;
            place*=2;
            temp=temp.next;
        }
        return value;
        
    }
    ListNode reverse(ListNode head){
         if (head.next==null)return head;
       ListNode prev=null;
       ListNode curr=head;

       ListNode temp=head;
       while(temp!=null){

        //store next node
         temp=curr.next;
         //change direction by changing node
         curr.next=prev;
         prev=curr;curr=temp;
       }
      return prev;//new head
    }
}