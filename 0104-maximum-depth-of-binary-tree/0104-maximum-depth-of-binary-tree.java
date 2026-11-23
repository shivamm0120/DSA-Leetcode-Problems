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
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;

        return findMaxDepth(root);

        
    }
    int findMaxDepth(TreeNode node){
        if(node==null)return 0;

        int leftSubTree=findMaxDepth(node.left);
        int rightSubTree=findMaxDepth(node.right);

        return Math.max(leftSubTree,rightSubTree)+1;
    }
}