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
    ArrayList<Integer> al;
    public int minDiffInBST(TreeNode root) {
        al=new ArrayList<>();
        inorder(root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<al.size()-1;i++)
        {
            int a=al.get(i+1)-al.get(i);
            if(a<min)
                min=a;
        }
        return min;
        
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