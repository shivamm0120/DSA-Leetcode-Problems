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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
        if(root==null)return list;
        
        ArrayDeque<TreeNode> deque=new ArrayDeque<>();
        deque.offer(root);

        while(!deque.isEmpty()){
            int size=deque.size();
           ArrayList<Integer> al=new ArrayList<>();

            for(int i=1;i<=size;i++){
                TreeNode node=deque.poll();
                al.add(node.val);

                if(node.left!=null)deque.offer(node.left);
                if(node.right!=null)deque.offer(node.right);

            }
            list.add(al);

        }
        return list;
        
    }
}