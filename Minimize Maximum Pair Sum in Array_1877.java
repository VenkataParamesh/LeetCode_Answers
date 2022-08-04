class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length/2;i++)
        {
          int a=nums[i]+nums[nums.length-i-1];
          if(max<a)
              max=a;
        }
        return max;
    }
}