class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] answer=new int[s.length()];
        int prev = getIndex(s, c, 0);
        int next = prev;
        for (int k = 0; k<s.length(); k++){
            answer[k] = Math.min(Math.abs(k-prev), Math.abs(next-k));
            if(next==k){
                prev = next;
                next = getIndex(s,c,k+1);
            }
        }
        return answer;  
    }
    public int getIndex(String s,char c,int start)
    {
        for(int i=start;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                return i;
            }
        }
        return -1;
    }
}