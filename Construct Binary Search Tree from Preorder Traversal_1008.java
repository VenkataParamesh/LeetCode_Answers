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
    TreeNode root=null;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0)
            return root;
        if(preorder.length==1)
        {
            root=new TreeNode(preorder[0]);
            return root;
        }
        root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
        {
            ConstructBinaryTree(root,preorder[i]);
        }
        return root;
    }
    public TreeNode ConstructBinaryTree(TreeNode root,int k)
    {
        if(root==null)
        {
            root=new TreeNode(k);
            return root;
        }
        if(root.val>k)
        {
           root.left=ConstructBinaryTree(root.left,k);
        }
        if(root.val<k)
        {
            root.right=ConstructBinaryTree(root.right,k);
        }
        return root;
    }
}