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
    int dist;
    Pair(TreeNode node,int dist){
        this.node=node;
        this.dist=dist;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list= new ArrayList<>();
        if(root==null)return list;

        Queue<Pair>q= new LinkedList<>();
        Map<Integer,Integer>map=new TreeMap<>();

        q.offer(new Pair(root,0));

        while(!q.isEmpty()){

            Pair p=q.poll();
            TreeNode node=p.node;
            int dist=p.dist;

            map.put(dist,node.val);

            if(node.left!=null)
              q.offer(new Pair(node.left,dist+1));

               if(node.right!=null)
              q.offer(new Pair(node.right,dist+1));


        }
        for(Integer e : map.values())
          list.add(e);
         
          return list;
    }
}