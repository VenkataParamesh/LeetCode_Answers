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
    public int sumRootToLeaf(TreeNode root) {
        sum(root,0);
        return sum;
        
    }
   private void sum(TreeNode node, int currBinary) {
		if (node == null) {
    		return;
		}
		currBinary = (currBinary << 1) + node.val;

		// If leaf, add to sum
		if (node.left == null && node.right == null) {
    		sum += currBinary;

			// Undo the shift whenever we're returning from the recurson to undo the bit we just appended
    		currBinary = currBinary >> 1;
    		return;
		}

		sum(node.left, currBinary);
		sum(node.right, currBinary);
	}
}