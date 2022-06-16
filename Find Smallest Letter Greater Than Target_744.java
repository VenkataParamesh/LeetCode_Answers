class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        if(target>=letters[letters.length-1])return letters[0];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(letters[mid]==target+1)
            {
                return letters[mid];
            }
            else if(letters[mid]>target+1)
            {
              end=mid-1;  
            }
            else
            {
                start=mid+1;
            }
        }
        return letters[start];
        
    }
}