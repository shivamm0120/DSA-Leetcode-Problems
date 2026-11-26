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
    int ans=-1001;
    public int maxPathSum(TreeNode root) {
       findMaxPath(root);
       return ans;
    }
    int findMaxPath(TreeNode root){
         if(root==null)return 0;
        int curr=root.val;
        int path=curr;

        int leftPath=findMaxPath(root.left);
        int rightPath=findMaxPath(root.right);

        path=Math.max(path,curr+leftPath);
        path=Math.max(path,curr+rightPath);

        ans=Math.max(ans,path);
        ans=Math.max(ans,curr+leftPath+rightPath);
        return path;

    }
}