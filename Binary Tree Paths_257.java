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
    List<String> al=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root,"");
        return al;  
    }
    public void dfs(TreeNode root,String s)
    {
        if(root==null)
            return;
        s=s+String.valueOf(root.val);
        if(root.left==null&&root.right==null)
            al.add(s);
        else
        {
            s=s+"->";
            dfs(root.left,s);
            dfs(root.right,s);
        }
    }
}