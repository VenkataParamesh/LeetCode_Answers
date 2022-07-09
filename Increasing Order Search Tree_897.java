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
   public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        List<TreeNode> traversal = new ArrayList<>();
        inorder(root, traversal);
        reorder(traversal);
        return traversal.get(0);
    }
    
    public void inorder(TreeNode root, List<TreeNode> traversal){
        if(root != null){
            inorder(root.left, traversal);
            traversal.add(root);
            inorder(root.right, traversal);
        }
    }
    
    public void reorder(List<TreeNode> traversal){
        for(int i=0; i<=traversal.size()-1; i++){
            TreeNode current = traversal.get(i);
            current.left = null;
            if(i<traversal.size()-1){
                current.right = traversal.get(i+1);
            }
        }
    }
}