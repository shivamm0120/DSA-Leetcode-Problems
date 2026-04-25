/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        ListNode prev= node;
        ListNode temp= node.next;
        while(temp.next!=null){
            prev.val=temp.val;
            prev=temp;
            temp=temp.next;
        }
        prev.val=temp.val;
        prev.next=null;
    
        
        
    }
}