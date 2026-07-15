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
    public int maxDepth(TreeNode root) {
        return computeMaxDepth(root);
    }

    private int computeMaxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int depth = 0;

        int leftDepth = computeMaxDepth(node.left);
        int rightDepth = computeMaxDepth(node.right);

        if (leftDepth > rightDepth) {
            depth = leftDepth + 1;
        } else {
            depth = rightDepth + 1;
        }

        return depth;
    }
}
