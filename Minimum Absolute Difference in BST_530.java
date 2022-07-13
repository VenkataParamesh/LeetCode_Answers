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
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        al=new ArrayList<>();
        Traverse(root);
        for(int i=0;i<al.size()-1;i++){
					int temp = al.get(i+1) - al.get(i);
					min = Math.min(temp,min);
				}
				return min;
       
        
    }
    public void Traverse(TreeNode root)
    {
        if(root==null)
            return;
        Traverse(root.left);
        al.add(root.val);
        Traverse(root.right);
    }
}