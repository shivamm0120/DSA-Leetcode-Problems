/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev,first,middle,last;
    public void recoverTree(TreeNode root) {
        recover(root,false);
        if(last==null){
            int temp=first.val;
            first.val=middle.val;
            middle.val=temp;
        }
    }
    boolean recover(TreeNode root,boolean swapped){
        if(root==null)return false;
        if(swapped)return true;

        if(recover(root.left,false))return true;

        if(prev==null ) prev=root;
        if(prev!=null && prev.val>root.val){
            if(first!=null)
               last=root;
            else{
                first=prev;
                middle=root;
            }
        }
        if(first!=null && last!=null){
            int temp=first.val;
            first.val=last.val;
            last.val=temp;
            return true;
        }
        prev=root;
        if(recover(root.right,false))return true;
        return false;

    }
}