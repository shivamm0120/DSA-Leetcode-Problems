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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null)return list;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        int level=1;

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer>al=new ArrayList<>();
          
            //level processing
            for(int i=1;i<=n;i++){

              TreeNode node=q.poll();
                 al.add(node.val);


                 if(node.left!=null) q.offer(node.left);
                 if(node.right!=null) q.offer(node.right);
            }
            if(level%2==0)Collections.reverse(al);
            list.add(al);
            level++;
        }
        return list;
        
    }
}