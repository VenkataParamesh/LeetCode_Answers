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
    boolean find=true;
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
            return false;
        int i=root.val;
        check(root,i);
       return find;
    }
    public void check(TreeNode root,int check)
    {
        if(root==null)
            return;
        if(root.val!=check)
        {
            find=false;
        }
       check(root.left,check);
       check(root.right,check);
        
    }
}