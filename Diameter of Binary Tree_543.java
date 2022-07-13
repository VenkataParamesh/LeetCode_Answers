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
    int path=0;
    public int diameterOfBinaryTree(TreeNode root) {
        Diameter(root);
        return path;
    }
    public int Diameter(TreeNode root)
    {
        if(root==null)
            return 0;
        int left=Diameter(root.left);
        int right=Diameter(root.right);
        path=Math.max(left+right,path);
        return Math.max(left,right)+1;
        
    }
}