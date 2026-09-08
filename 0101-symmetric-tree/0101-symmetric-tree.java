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

class Mirror{
    TreeNode node1;
    TreeNode node2;
    
    Mirror(TreeNode node1,TreeNode node2){
        this.node1=node1;
        this.node2=node2;
    }
}
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<Mirror>q=new LinkedList<>();

        q.offer(new Mirror(root.left,root.right));

        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                Mirror m=q.poll();
                TreeNode node1=m.node1;
                TreeNode node2=m.node2;

                if(node1==null && node2==null)
                  continue;
                if(node1==null || node2==null)
                  return false;
                if(node1.val!=node2.val)
                 return false;

                 q.offer(new Mirror(node1.left,node2.right));
                 q.offer(new Mirror(node1.right,node2.left));

            }
          
        }
        return true;
    }
       
}