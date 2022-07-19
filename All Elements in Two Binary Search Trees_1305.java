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
    List<Integer> arl=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Traversal(root1);
        Traversal(root2);
        Collections.sort(arl);
        return arl;
        
        
    }
    public void Traversal(TreeNode root)
    {
        if(root==null)
            return;
        arl.add(root.val);
        Traversal(root.left);
        Traversal(root.right);
        
    }
}