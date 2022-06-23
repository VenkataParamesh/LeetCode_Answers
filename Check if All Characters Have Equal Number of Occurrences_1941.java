class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.get(ch)==null?1:map.get(ch)+1);
        }
        int a=map.get(s.charAt(0));
        for(int i=1;i<s.length();i++) 
        {
            if(map.get(s.charAt(i))!=a)
                return false;
        }
        return true;
    }
}