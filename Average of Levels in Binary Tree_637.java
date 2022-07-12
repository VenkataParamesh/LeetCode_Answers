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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> al=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        if(root==null)
            return al;
        qu.add(root);
        while(!qu.isEmpty())
        {
            double sum=0;
            int n=qu.size();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=qu.poll();
                sum=sum+(double)(temp.val);
                if(temp.left!=null)
                    qu.add(temp.left);
                if(temp.right!=null)
                    qu.add(temp.right);
            }
            al.add(sum/n);
        }
        
        return al;
    }
}