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
       int result= compute(root,limit,0);
       if(result<limit)return null;
        return root;
        

    }
    int compute(TreeNode node, int limit,int curr){
        if(node==null)return Integer.MIN_VALUE;
        
        if(node.left==null && node.right==null)return node.val;

        curr+=node.val;
        //System.out.println(curr+"\n");


        
        int left=compute(node.left,limit,curr);

            System.out.println(left+" "+node.val);
           if( curr+left<limit){
           node.left=null;
           }
          
    
          int right=compute(node.right,limit,curr);
         
           if(curr+right<limit){
           node.right=null;
           //right=0;
           }
         
         return node.val+Math.max(left,right);
    }
}