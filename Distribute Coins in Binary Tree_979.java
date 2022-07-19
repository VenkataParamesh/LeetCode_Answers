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
int ans=0;
public int distributeCoins(TreeNode root) {
fun(root);
return ans;
}
int fun(TreeNode root)
{
if(root==null)return 0;
int l=fun(root.left);
int r=fun(root.right);
ans+=Math.abs(root.val+l+r-1);
return root.val+l+r-1;
}
}