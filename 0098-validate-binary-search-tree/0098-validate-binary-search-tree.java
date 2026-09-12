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

    public boolean isValidBST(TreeNode root) {
        long min=Integer.MIN_VALUE;
        long max=Integer.MAX_VALUE;

        return isValid(root,min-1,max+1);


        
        
    }
    boolean isValid(TreeNode root,long min,long max){
        if(root==null)return true;

        long curr=root.val;
        if(curr<=min || curr>=max)return false;


        boolean left=isValid(root.left,min,curr);
        if(!left)return false;
        boolean right=isValid(root.right,curr,max);
        if(!right)return false;

        return true;
    }
}
        // if(min==Integer.MIN_VALUE && max==Integer.MAX_VALUE){    }
        // else if(min!=Integer.MIN_VALUE && max!=Integer.MAX_VALUE){
        //      if(curr<=min|| curr>=max)return false;
        // }
        // else if(min!=Integer.MIN_VALUE){
        //    if(curr<=min)return false;
        // }
        // else if(curr>=max){
        //     System.out.println("current got max");
        //     return false;
        // }