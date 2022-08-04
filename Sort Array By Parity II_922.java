class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr[]=new int[nums.length];
        int ev=0;
        int odd=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                arr[ev]=nums[i];
                ev+=2;
            }
            else
            {
                arr[odd]=nums[i];
                odd=odd+2;
            }
        }
        return arr;
        
    }
}