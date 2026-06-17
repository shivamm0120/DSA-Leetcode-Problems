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
    public ListNode sortList(ListNode head) {
        if(head==null)return head;
        return sort(head);

        
    }
    ListNode sort(ListNode node){
        //single element
        if(node==null||node.next==null)return node;

        //find middle node
        ListNode middle =findMiddle(node);
        ListNode next=middle.next;
        middle.next=null;

        ListNode first=sort(node);
        ListNode second=sort(next);

        return merge(first,second);
    }
    ListNode findMiddle(ListNode node){
        ListNode prev=null;
        ListNode slow=node;
        ListNode fast=node;

        while(fast!=null&& fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        return prev;
    }
    ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy= new ListNode();
        ListNode current=dummy;


        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                current.next=list1;
                list1=list1.next;
            }
            else {
                current.next=list2;
                list2=list2.next;
            }
                current=current.next;
        }
        if(list1!=null){
            current.next=list1;
           
        }
        else{
         current.next=list2;
        }
        return dummy.next;
    }

   
}