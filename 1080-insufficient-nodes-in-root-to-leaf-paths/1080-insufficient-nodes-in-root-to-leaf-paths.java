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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
       if(compute(root,limit,0)<limit)return null;
        return root;
    }


    int compute(TreeNode node, int limit,int curr){
        curr+=node.val;
        
        if(node.left==null && node.right==null)return curr;

        int left=Integer.MIN_VALUE;
        int right=Integer.MIN_VALUE;
        
        if(node.left!=null)
           left=compute(node.left,limit,curr);

        if( left<limit)
           node.left=null;

        if(node.right!=null)
        right=compute(node.right,limit,curr);

        if(right<limit)
           node.right=null;

         return Math.max(left,right);
    }
}