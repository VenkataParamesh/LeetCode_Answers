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
    Map<Integer,Integer> m;
    public int[] findMode(TreeNode root) {
        m=new HashMap<Integer,Integer>();
        EnterIntoHashMap(root);
        int v = m.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getValue();
                        
       List<Integer> list = new ArrayList<>();
        for(Map.Entry e:  m.entrySet()){
            if((int)e.getValue() == v){
                list.add((int)e.getKey());
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for(int val : list){
            res[index++] = val;
        }
        return res;
        
    }
    public void EnterIntoHashMap(TreeNode root)
    {
        if(root==null)
            return;
        m.put(root.val,m.getOrDefault(root.val,0)+1);
        EnterIntoHashMap(root.left);
        EnterIntoHashMap(root.right);
    }
}