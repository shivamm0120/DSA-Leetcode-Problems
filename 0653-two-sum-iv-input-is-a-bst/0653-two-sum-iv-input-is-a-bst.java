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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer>al=new ArrayList<>();
        return findSum(al,root,k);



        
    }
    boolean findSum(List<Integer>al,TreeNode root,int k){
        if(root==null)return false;

        int complement=k-root.val;
        if(al.contains(complement))return true;
        else al.add(root.val);
        if(findSum(al,root.left,k)||findSum(al,root.right,k))return true;
        return false;
    }
}