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
    List<Integer> al=new ArrayList<Integer>();
    public TreeNode balanceBST(TreeNode root) {
        if(root==null)
            return root;
        inorder(root);
        return createBalancedTree(0,al.size()-1);
        
    }
    public TreeNode createBalancedTree(int start,int end)
    {
        if(start>end)
            return null;
        int mid=start+(end-start)/2;
        TreeNode temp=new TreeNode(al.get(mid));
        temp.left=createBalancedTree(start,mid-1);
        temp.right=createBalancedTree(mid+1,end);
        return temp;
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
}