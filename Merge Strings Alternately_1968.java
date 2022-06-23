class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb1=new StringBuilder();
        int min=Math.min(word1.length(),word2.length());
        int i=0;
        while(i<min)
        {
            sb1.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        if(word1.length()<word2.length())
        {
            sb1.append(word2.substring(i,word2.length()));
        }
        else
            sb1.append(word1.substring(i,word1.length()));
        String s=sb1.toString();
        return s;
    }
}