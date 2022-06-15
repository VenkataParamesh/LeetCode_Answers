class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int i:nums2){
            if(set.contains(i)){
                li.add(i);
                set.remove(i);
            }
        }
        int res[]= new int[li.size()];
        for(int j=0;j<li.size();j++){
            res[j]=li.get(j);
        }
        return res;
    }
}