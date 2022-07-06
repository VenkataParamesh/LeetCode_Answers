class Solution {
    public boolean detectCapitalUse(String word) {
        boolean res=false;
        int count=0,small=0;
        if(Character.isUpperCase(word.charAt(0)))
        {
            res=true;
            count++;
        }
        for(int i=0;i<word.length();i++)
        {
            if(i!=0&&Character.isUpperCase(word.charAt(i)))
            {
                count++;
                res=false;
            }
            else
            {
                small++;
            }
        }
        if(small==word.length())
            return true;
        if(count==word.length())
            return true;
        return res;
    }
}