class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 1. Both null
        if (p == null && q == null) return true;
        
        // 2. One null
        if (p == null || q == null) return false;
        
        // 3. Value check + recursive check
        if (p.val != q.val) return false;
        
        return isSameTree(p.left, q.left) && 
               isSameTree(p.right, q.right);
    }
}