class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.empty())
                st.push(s.charAt(i));
            else
            {
                if(s.charAt(i)==st.peek())
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        String ret  = "";
        while(!st.empty()){
            ret = st.pop() + ret;
        }
        return ret;
        
        
    }
}