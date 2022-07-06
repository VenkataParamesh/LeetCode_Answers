class Solution {
    public String addStrings(String n1, String n2) {
       StringBuilder nm=new StringBuilder();
        int c=0;
        for(int i=n1.length()-1,j=n2.length()-1;i>=0||j>=0||c==1;i--,j--)
        {
            int a=i<0 ? 0 : n1.charAt(i) - '0';
            int b=j<0 ? 0 : n2.charAt(j) - '0';
            nm.append((c+a+b)%10);
            c=(c+a+b)/10;
        }
        return nm.reverse().toString();
        
    }
}