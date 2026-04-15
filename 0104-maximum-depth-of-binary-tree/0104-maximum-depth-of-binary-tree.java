class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: if tree is empty
        if (root == null) {
            return 0;
        }

        // Recursively find depth of left and right subtrees
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // Return max depth + current node
        return 1 + Math.max(left, right);
    }
}