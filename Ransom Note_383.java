class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch= ransomNote.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1); 
            }else{
                return false;
            }
        }
        for(Map.Entry<Character, Integer> e: map.entrySet()){
            if(e.getValue() <0 )
                return false;
        }
        return true;
        
        
    }
}