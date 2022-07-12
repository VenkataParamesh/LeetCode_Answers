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
     ArrayList<Integer> al1=new ArrayList<>();
    ArrayList<Integer>al2=new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        addElements(root1,al1);
        addElements(root2,al2);  
        return (al1.equals(al2));
    }
    public ArrayList<Integer> addElements(TreeNode root,ArrayList<Integer> al)
    {
        if(root==null)
            return al;
        if(root.left==null&&root.right==null)
        {
            al.add(root.val);
        }
        addElements(root.left,al);
        addElements(root.right,al);
        return al;
    }
}