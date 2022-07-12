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
    Set<Integer>elements= new LinkedHashSet<>();
    public boolean findTarget(TreeNode root, int k) {
            if(root==null)
                return false;
        if(elements.contains(k-root.val))
                return true;
        elements.add(root.val);
        return findTarget( root.left,  k)||findTarget(root.right, k);
}
}