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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int half=count/2;temp=head;
        while(half>0){
            temp=temp.next;
            half--;
        }
        half=count/2;
        if(count%2!=0)temp=temp.next;

        ListNode last=reverse(temp);

        temp=head;
        while(half>0){
            if(last.val!=temp.val)return false;
            temp=temp.next;
            last=last.next;
            half--;
        }
        return true;
    }
    ListNode reverse(ListNode temp){
        ListNode prev=null;
        ListNode forward=temp;
        while(forward!=null){
            forward=temp.next;
            temp.next=prev;
            prev=temp;
            temp=forward;



        }
        return prev;


    }
}