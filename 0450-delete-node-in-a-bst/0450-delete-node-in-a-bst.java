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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;

        int ele=root.val;

        if(ele<key)
        root.right=deleteNode(root.right,key);
        else if(ele>key)
         root.left= deleteNode(root.left,key);

        else{
            //no child
            if(root.left==null && root.right==null)return null;

            //one child
            if(root.left==null)return root.right;
            if(root.right==null)return root.left;

            //two child
            TreeNode node=root.right;
            //if(node.left==null)return node;
            
            TreeNode prev=root;
            while(node.left!=null){
                prev=node;
                node=node.left;
            }

            System.out.println(prev.val);
            if(prev==root)prev.right=node.right;
            else prev.left=node.right;

            root.val=node.val;
            node.right=null;
        }
        return root;
    }
}