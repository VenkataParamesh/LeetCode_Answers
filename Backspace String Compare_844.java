class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1 = makes(s);
        String t1 = makes(t);
        if (s1.equals(t1)) return true;
        return false;
    }
    public String makes(String s){
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#') sb1.append(s.charAt(i));
            else{
                if(sb1.length()>0) sb1.setLength(sb1.length()-1);
            }
        }
        return sb1.toString();
    }
}