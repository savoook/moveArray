package sameTree;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
