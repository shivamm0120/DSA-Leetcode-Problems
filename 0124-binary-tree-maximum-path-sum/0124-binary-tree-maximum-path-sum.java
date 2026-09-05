class Solution {

    int path = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        findSum(root);

        return path;
    }

    public int findSum(TreeNode root) {

        if (root == null)
            return 0;

        /*
         * Get maximum contribution from left and right subtree.
         *
         * If contribution is negative, don't include it.
         * Hence Math.max(0, contribution).
         */
        int lp = Math.max(0, findSum(root.left));
        int rp = Math.max(0, findSum(root.right));

        /*
         * Complete path through current node:
         *
         *        left
         *          \
         *          root
         *          /
         *       right
         *
         * This path can use BOTH left and right.
         * But this value is only used for the global answer.
         */
        path = Math.max(path, lp + root.val + rp);

        /*
         * Return value to parent:
         *
         * Parent can take only ONE side.
         *
         * We cannot return:
         *     lp + root + rp
         *
         * because then the path would branch.
         */
        return root.val + Math.max(lp, rp);
    }
}