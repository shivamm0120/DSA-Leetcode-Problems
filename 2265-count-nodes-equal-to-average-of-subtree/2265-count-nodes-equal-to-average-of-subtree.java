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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        compute(root);
        return ans;
        
    }
   int[] compute(TreeNode node){
        if(node==null)
          return new int[] {0,0};

          int[] left=compute(node.left);
          int leftSum=left[0];
          int leftCount=left[1];

          int[] right=compute(node.right);
          int rightSum=right[0];
          int rightCount=right[1];

          int total=rightSum+leftSum+node.val;
          int count=leftCount+rightCount+1;
          if(node.val==total/count)
            ans++;

            return new int[]{total,count};
    }
}