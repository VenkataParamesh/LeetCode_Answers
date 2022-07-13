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
    int levelsum;
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int n=qu.size();
            levelsum=0;
            for(int i=0;i<n;i++)
            {
                TreeNode temp=qu.poll();
                levelsum=levelsum+temp.val;
                if(temp.left!=null) qu.add(temp.left);
                if(temp.right!=null) qu.add(temp.right);
            }
        }
        return levelsum;
        
        
    }
}