class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
        long start=0,end=num;
        while(start<=end)
        {
            long mid=(long)start+(end-start)/2;
            if(mid*mid==num)
            {
                return true;
            }
            else if(mid*mid>num)
            {
              end=(long)mid-1;  
            }
            else
            {
                start=(long)mid+1;
            }
        }
        return false;
    }
}