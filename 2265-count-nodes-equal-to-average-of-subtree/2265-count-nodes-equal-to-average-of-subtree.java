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
 class Pair{
    int sum;
    int count;
    Pair(int sum,int count){
        this.sum=sum;
        this.count=count;
    }
 }
class Solution {
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        compute(root);
        return ans;
        
    }
    Pair compute(TreeNode node){
        if(node==null)
          return new Pair(0,0);

          Pair p1=compute(node.left);
          int leftSum=p1.sum;
          int leftCount=p1.count;

          Pair p2=compute(node.right);
          int rightSum=p2.sum;
          int rightCount=p2.count;

          int total=rightSum+leftSum+node.val;
          int count=leftCount+rightCount+1;
          if(node.val==total/count)
            ans++;

            return new Pair(total,count);
    }
}