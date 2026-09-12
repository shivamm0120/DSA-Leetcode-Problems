/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p||root==q)return root;

        int curr=root.val;
        if(p.val<curr && q.val<curr){
         TreeNode left=lowestCommonAncestor(root.left,p,q);
         if(left!=null)return left;
        }
        if(p.val>curr && q.val>curr){
            TreeNode right=lowestCommonAncestor(root.right,p,q);
            if(right!=null)return right;
        }
        return root;
        
    }
}