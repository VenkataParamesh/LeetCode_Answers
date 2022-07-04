class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> mp = new HashMap<>();
    
    for(char i=0;i<s.length();i++){
        char c = s.charAt(i);
        mp.put(c,mp.getOrDefault(c,0)+1);
    }
    
    for(char j =0;j<t.length();j++){
        char ch = t.charAt(j);
        if(mp.containsKey(ch) && mp.get(ch)>0){
            mp.put(ch,mp.get(ch)-1);
        }else{
            return ch;
        }
    }
    return ' ';
    }
}