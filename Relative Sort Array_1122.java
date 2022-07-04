class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
    
       Map<Integer,Integer> map = new TreeMap<>();
       for(int i:arr1) 
       {
           map.put(i,map.getOrDefault(i,0)+1);
       }
        System.out.println(map);
       int k=0;
       for(int j:arr2)
       {
        int n = map.remove(j);
          for(int i=0;i<n;i++){
            arr1[k++]=j;
          }
        }
        for(Integer i:map.keySet())
        {
          int n=map.get(i);
            for(int l=0;l<n;l++)
            {
             arr1[k++]=i;
            }
        }
    return arr1;
    }
}