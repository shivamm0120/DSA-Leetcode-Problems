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
    int path=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       // path=Math.max(path,findSum(root));
      // int path2=
       int path1=findSum(root);
       return path>path1?path:path1;



       // return Math.max(path,path2);
        
    }
    public int findSum(TreeNode root){
        if (root==null)return 0;

        int lp=findSum(root.left);
        int rp=findSum(root.right);

        path=Math.max(path,lp+rp+root.val);
        path=Math.max(path,lp+root.val);
        path=Math.max(path,rp+root.val);
        path=Math.max(path,root.val);



        
        // if(lp+rp+root.val<root.val)path=Math.max(path,root.val);
        // else 
        // path=Math.max(path,lp+rp+root.val);

        return (root.val>Math.max(lp,rp)+root.val)?root.val:Math.max(lp,rp)+root.val;
    }
}