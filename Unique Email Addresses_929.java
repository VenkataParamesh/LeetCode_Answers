class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> hs=new HashSet<>();
       for(String s:emails)
       {
           StringBuilder sb=new StringBuilder();
           char ch[]=s.substring(0,s.indexOf('@')).toCharArray();
           for(char c:ch)
           {
               if(c=='+')
                   break;
               else if(c=='.')
                   continue;
               else
                   sb.append(c);
           }
           sb.append(s.substring(s.indexOf("@"),s.length()));
           hs.add(sb.toString());
       }
        return hs.size();
        
    }
}