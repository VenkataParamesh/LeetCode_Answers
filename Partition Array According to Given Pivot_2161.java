class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
     int start=0,end=nums.length-1;
     int ans[]=new int[nums.length];
     int i;
     for(i=0;i<nums.length;i++)
     {
         if(nums[i]<pivot)
         {
             ans[start]=nums[i];
             start++;
         }
         if(nums[nums.length-1-i]>pivot)
         {
             ans[end]=nums[nums.length-1-i];
             end--;   
         }
     }
        while(start<=end)
        {
            ans[start++]=pivot;
            ans[end--]=pivot;
        }
        return ans;
    }
}