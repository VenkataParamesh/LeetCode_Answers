class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<arr.length; i++)
            hm.put(arr[i], i);
        
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i]*2) && i != hm.get(arr[i]*2))
                return true;
        }
        return false;
    }
}