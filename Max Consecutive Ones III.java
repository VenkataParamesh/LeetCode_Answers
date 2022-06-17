class Solution {
    public int longestOnes(int[] nums, int k) {
        int right = 0, left = 0, zerocount = 0;
        for(right = 0 ; right < nums.length ; right++){
            if(nums[right] == 0) zerocount = zerocount + 1;
            if(zerocount >  k){
                if(nums[left] == 0)
                {
                    zerocount = zerocount - 1;
                }
                left = left + 1;
            }
        }
        return right - left;
    }
}