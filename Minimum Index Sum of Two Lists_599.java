class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        Map<String,Integer> map=new HashMap<>();
        ArrayList<String> l=new ArrayList<>();
        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]))
            {
                int a=map.get(list2[i])+i;
                    if(a<min)
                    {
                        min=a;
                        l=new ArrayList<>();
                        l.add(list2[i]);
                    }
                else if(a==min)
                    l.add(list2[i]);
            }
        }
        String[] ans = new String[l.size()];
        return l.toArray(ans);
        
    }
}