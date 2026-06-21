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
        if(head.next==null)return head.val;

        ListNode temp=head;
        int value=0;

        while(temp!=null){
            value=value*2+temp.val;
            temp=temp.next;
        }
        return value;
        
    }
   
}