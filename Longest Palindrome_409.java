class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int total=0,aux=0;
        for(Map.Entry<Character,Integer>e:map.entrySet())
        {
            total=total+e.getValue();
            if(e.getValue()%2!=0)
            {
                total=total-1;
                aux=1;
            }
        }
        return total+aux;
        
    }
}