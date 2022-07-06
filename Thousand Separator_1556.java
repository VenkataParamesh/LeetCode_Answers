class Solution {
    public String thousandSeparator(int n) {
        if(n<1000)
            return n+"";
        String str=n+"";
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            sb.append(str.charAt(i));
            count++;
            if(count==0&&i!=0)
            {
                sb.append(".");
                count=0;
            }
        }
        return sb.reverse().toString();    
    }
}