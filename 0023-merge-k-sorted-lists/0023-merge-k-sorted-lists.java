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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans= new ListNode(-1);
        ListNode temp=ans;
        int k=lists.length;

        while(true){
            int minIndex=-1;int min=-1;
            for(int i=0;i<k;i++){
                if(lists[i]!=null){
                    if(minIndex==-1)minIndex=i;
                    else{
                        if(lists[i].val<lists[minIndex].val)
                           minIndex=i;
                    }
                }


            }
            if(minIndex==-1)break;
            temp.next=lists[minIndex];
            temp=temp.next;
            lists[minIndex]=lists[minIndex].next;
        }
        return ans.next;
        
    }
}