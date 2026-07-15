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
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return check(p, q);
    }

    private boolean check(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        } else if (a != null && b != null) {
            return (
                a.val == b.val &&
                check(a.left, b.left) &&
                check(a.right, b.right)
            );
        } else {
            return false;
        }
    }
}
