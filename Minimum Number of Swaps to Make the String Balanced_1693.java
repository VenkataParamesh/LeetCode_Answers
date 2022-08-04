class Solution {
    public int minSwaps(String s) {
        int count = 0;
        int left = 0;
        int right = s.length() - 1;
        int opening = 1;
        while(left <= right)
        {
            if(s.charAt(left) == '[')
                opening++;
            else
                opening--;
            if(opening <= 0)
            {
                while(s.charAt(right) != '[')
                    right--;
                opening += 2;
                count++;
            }
            left++;
        }
        return count;
    }
}