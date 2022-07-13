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
    int sum=0;
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null)
            return 0;
        TreeNode leftR=root.left,rightR=root.right;
        boolean flag=((root.val)%2==0);
        if(flag&&leftR!=null)
        {
            if(leftR.left!=null)
                sum=sum+leftR.left.val;
            if(leftR.right!=null)
                sum=sum+leftR.right.val;
        }
        if(flag&&rightR!=null)
        {
            if(rightR.left!=null)
                sum=sum+rightR.left.val;
            if(rightR.right!=null)
                sum=sum+rightR.right.val;
        }
        sumEvenGrandparent(root.left);
        sumEvenGrandparent(root.right);
            
        return sum;
        
    }
}