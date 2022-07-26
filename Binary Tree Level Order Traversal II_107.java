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
    List<List<Integer>> lists=new ArrayList<>();
    List<List<Integer>> lists2=new ArrayList<>();
    Queue<TreeNode> qu=new LinkedList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null)
            return lists2;
        if(root.right==null&&root.left==null)
        {
            List<Integer> list=new ArrayList<>();
            list.add(root.val);
            lists.add(list);
            return lists;    
        }
        qu.add(root);
        while(!qu.isEmpty())
        {
            int n=qu.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                TreeNode temp=qu.poll();
                list.add(temp.val);
                if(temp.left!=null)
                    qu.add(temp.left);
                if(temp.right!=null)
                    qu.add(temp.right);
            }
            lists.add(list);
        }
        
        for(int i =  lists.size()-1; i>=0;i--){
                lists2.add(lists.get(i));
        }
        return lists2;
        
        
    }
}