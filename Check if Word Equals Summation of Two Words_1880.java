class Solution {
    public int helper(String str) {
        
        StringBuilder temp = new StringBuilder();
        
        for(char c : str.toCharArray())
            temp.append( c - 'a');
			
        return Integer.parseInt(temp.toString());
    }
    
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
  
        return (helper(firstWord) + helper(secondWord)) == helper(targetWord);
    }
}