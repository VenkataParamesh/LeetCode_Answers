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
    int depth(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int lDepth = depth(root.left);
        int rDepth = depth(root.right);
        if(lDepth == 0){
            return rDepth + 1;
        }
        if(rDepth == 0){
            return lDepth + 1;
        }
        return Math.min(lDepth, rDepth) + 1;
    }
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root);
    }
}