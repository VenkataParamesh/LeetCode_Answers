class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,min=Integer.MAX_VALUE;
        int sum=0;
        while(i<=j&&j<nums.length)
        {
            if(sum+nums[j]>=target)
            {
                sum=sum-nums[i];
                min=Math.min(min,j-i+1);
                i++;
            }
            else
            {
                sum=sum+nums[j];
                j++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
        
    }
}