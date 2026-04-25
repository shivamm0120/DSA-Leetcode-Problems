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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1= l1;
        ListNode t2= l2,prev=t2;

        int carry=0,sum=0;

        while(t1!=null && t2!=null){
            sum=t1.val+t2.val+carry;
            if(sum>=10){
                t2.val=sum%10;
                carry=1;
            }else{
                t2.val=sum;
                carry=0;
            }
            t1=t1.next;
            prev=t2;
            t2=t2.next;
        }

        if(t1==null && t2== null ){
            if(carry==1)
             prev.next=new ListNode(1);
        }
        else if(t1==null){
           prev= computeSum(t2,carry);
            
        }
        else {
            prev.next=t1;
           prev= computeSum(t1,carry);
        }

             return l2;
        
    }

     static ListNode computeSum(ListNode node, int carry) {
        ListNode prev = null;

        while (node != null && carry != 0) {
            int sum = node.val + carry;

            if (sum >= 10) {
                node.val = sum % 10;
                carry = 1;
            } else {
                node.val = sum;
                carry = 0;
            }

            prev = node;
            node = node.next;
        }
            if(carry==1)
             prev.next=new ListNode(1);

        return prev;
    }
   

}