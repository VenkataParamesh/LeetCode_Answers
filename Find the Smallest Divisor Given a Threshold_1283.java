class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int i:nums) max = Math.max(max,i);
        if(nums.length==threshold) return max;
        int left = 1;
        int right = max-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(calResult(mid,nums)>threshold) left = mid+1;
            else right = mid;
        }
        return left;
    }
    
    public int calResult(int divisor, int[] nums){
        int res = 0;
        for(int i: nums){
            res+=i/divisor;
            if(i%divisor!=0) res++;
        }
        return res;
    }
}