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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null )return true;

        int left=height(root.left);
        int right=height(root.right);
        System.out.println(root.val+" "+left+" "+right);
        int heightDiff=Math.abs(left-right);
        System.out.println(heightDiff);

        if(heightDiff>1)return false;

        if(!isBalanced(root.left))
         return false;
        if(!isBalanced(root.right))
         return false;


        return true;
    }
    public int height(TreeNode root){
        if(root==null)
          return 0;
        
        int left=height(root.left);
        int right=height(root.right);
        return 1+Math.max(left,right);
    }
}