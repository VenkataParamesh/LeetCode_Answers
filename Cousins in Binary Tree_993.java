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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> qu=new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int n=qu.size();
            boolean isx=false;
            boolean isy=false;
            for(int i=0;i<n;i++)
            {
                TreeNode temp=qu.poll();
               if(temp.val==x)
                   isx=true;
                if(temp.val==y)
                    isy=true;
                if(temp.left!=null&&temp.right!=null)
                {
                    if(temp.left.val==x&&temp.right.val==y)
                        return false;
                    if(temp.left.val==y&&temp.right.val==x)
                        return false;
                }
                if(temp.left!=null)
                    qu.add(temp.left);
               if(temp.right!=null)
                    qu.add(temp.right);
            }
            
            if(isx&&isy)return true;    
        }
        return false;

        
    }
}