class Solution {
    public String reverseWords(String s) {
        String str[]=s.split(" ");
        StringBuilder finalsb=new StringBuilder();
        for(int i=0;i<str.length-1;i++)
        {
            finalsb.append(ReverseString(str[i])+" ");  
        }
        finalsb.append(ReverseString(str[str.length-1]));
        String s2=finalsb.toString();
        return s2;
        
    }
    public String ReverseString(String s)
    {
        StringBuilder sb=new StringBuilder();
        int start=0,end=s.length()-1;
        while(end>=0){
            sb.append(s.charAt(end));
            end--;
        }
      String s1=sb.toString();
        return s1;
    }
}