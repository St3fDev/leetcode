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
    int maxDepth = 0;
    int sum = 0;
    
    public void getLeaves(TreeNode root, int depth) {
        if (root == null) 
            return;
        if (depth > maxDepth) {
            maxDepth = depth;
            sum = 0;
        }
        
        if (depth == maxDepth)
            sum += root.val;
        getLeaves(root.left, depth + 1);
        getLeaves(root.right, depth + 1);
    }
    
    public int deepestLeavesSum(TreeNode root) {
        getLeaves(root, 0);
        return sum;
    }
}