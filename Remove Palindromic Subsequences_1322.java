class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder sb1=new StringBuilder();
        sb1.append(s);
        sb1.reverse();
        String s1=sb1.toString();
        if(s1.equals(s))
            return 1;
        else
            return 2;
        
    }
}