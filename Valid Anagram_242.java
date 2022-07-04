class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length()!=t.length())
           return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0;j<t.length();j++)
        {
            if(map.containsKey(t.charAt(j))&&map.get(t.charAt(j))!=0)
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            else
                return false;
        }
        return true;
        
    }
}