class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb1=new StringBuilder();
        if(word.indexOf(ch)==-1)
        {
            return word;
        }
        //int x=word.indexOf(ch);
        String s1=word.substring(0,word.indexOf(ch)+1);
        String s2=word.substring(word.indexOf(ch)+1,word.length());
        sb1.append(s1);
        sb1=sb1.reverse();
        sb1.append(s2);
        String s=sb1.toString();
        return s;
    }
}