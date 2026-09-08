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
    int col;
    Pair(TreeNode node,int col){
        this.node=node;
        this.col=col;
    }
}
class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<Pair>q= new LinkedList<>();
        boolean rootNode=true;

        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int n=q.size();
            List<Pair>al=new ArrayList<>();
            for(int i=1;i<=n;i++){

                if(n%2!=0 && !rootNode)return false;

               Pair p=q.poll();
               TreeNode node=p.node;
               int col=p.col;
                al.add(p);

                if(node.left!=null)
                  q.offer(new Pair(node.left,col-1));
                if(node.right!=null)
                  q.offer(new Pair(node.right,col+1));

                if(rootNode)rootNode=false;
                if(n==1)break;
                if(i==n)
                    if(!check(al)) return false;
            }
            
        }
        return true;

        
        
    }
    boolean check(List<Pair>al){
        
        int n=al.size();
        for(int i=0;i<n/2;i++){
            Pair p1=al.get(i);
            Pair p2=al.get(n-i-1);
            if(p1.node.val!=p2.node.val || p1.col+p2.col!=0)return false;
        }
        
        return true;
    }
}