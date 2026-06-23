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
    public ListNode rotateRight(ListNode head, int k) {
       if(head==null|| head.next==null)return head;

        ListNode temp= head;
        int n=0;
        ListNode last=null;

        while(temp!=null){

            if(temp.next==null)last=temp;
            temp=temp.next;
            n++;
        }

        k=k%n;

        ListNode prev=findKthNode(head,k);

        last.next=head;
        head=prev.next;
        prev.next=null;

        return head;
    }
    ListNode findKthNode(ListNode head,int k){
        ListNode prev=head;
        ListNode curr=head;

        while(k-->0){
            curr=curr.next;
        }
        while(curr.next!=null){
            curr=curr.next;
            prev=prev.next;
        }
        return prev;
    }


}