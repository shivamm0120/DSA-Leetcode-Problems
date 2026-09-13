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
    Stack<TreeNode>s1=new Stack<>();
    Stack<TreeNode>s2=new Stack<>();

    public boolean findTarget(TreeNode root, int k) {
        push1(root);
        push2(root);
        return findTwoSum(k);
    }
    boolean findTwoSum(int k){

        if(s1.isEmpty()|| s2.isEmpty())return false;
        if(s1.peek()==s2.peek())return false;

        TreeNode node1=s1.peek();
        TreeNode node2=s2.peek();

        int sum=node1.val + node2.val;
        if(sum==k)return true;
        if(sum<k){
           TreeNode node= s1.pop();
           push1(node.right);
        }
        else{
            push2(s2.pop().left);
        }
        return findTwoSum(k);

    }
    public void push1(TreeNode node){
        while(node!=null){
            s1.push(node);
            node=node.left;
        }
    }
    public void push2(TreeNode node){
        while(node!=null){
            s2.push(node);
            node=node.right;
        }
    }

}