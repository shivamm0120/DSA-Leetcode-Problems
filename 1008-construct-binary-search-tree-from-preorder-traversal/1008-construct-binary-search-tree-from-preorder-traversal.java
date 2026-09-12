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
    int index=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return formBst(preorder,0,1001);
        
    }
    TreeNode formBst(int[]preorder,int min,int max){
        TreeNode node=new TreeNode();
        int curr=node.val=preorder[index++];

        if(index==preorder.length)return node;

        int next=preorder[index];

        if(curr>next && next>min){
            node.left=formBst(preorder,min,curr);
        }
        if(index==preorder.length)return node;
        next=preorder[index];
        if(curr<next && next<max )
            node.right=formBst(preorder,curr,max);
        
        return node;

    }
}