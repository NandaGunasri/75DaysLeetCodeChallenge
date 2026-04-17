class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // Base case
        if (root == null) return false;

        // If same tree found
        if (isSameTree(root, subRoot)) return true;

        // Check left and right
        return isSubtree(root.left, subRoot) || 
               isSubtree(root.right, subRoot);
    }

    // Helper function to check identical trees
    private boolean isSameTree(TreeNode p, TreeNode q) {
        // Both null → same
        if (p == null && q == null) return true;

        // One null or values differ → not same
        if (p == null || q == null || p.val != q.val) return false;

        // Check left and right
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}