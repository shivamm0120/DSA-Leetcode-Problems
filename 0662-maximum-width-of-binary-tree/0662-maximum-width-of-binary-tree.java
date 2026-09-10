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
    TreeNode node;
    int index;
    Pair(TreeNode node,int index){
        this.node=node;
        this.index=index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();

        q.offer(new Pair(root,1));
        int ans=1;

        while(!q.isEmpty()){
            int n=q.size();
            int left=q.peek().index;
            for(int i=1;i<=n;i++){
                Pair p=q.poll();
                TreeNode node=p.node;
                int index=p.index;
               
                ans=Math.max(ans,index-left+1);

                if(node.left!=null)
                   q.offer(new Pair(node.left,index*2));
                if(node.right!=null)
                    q.offer(new Pair(node.right,index*2+1));
            }
        }
        return ans;
        
    }
}