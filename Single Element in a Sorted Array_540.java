class Solution {
    public int singleNonDuplicate(int[] nums) {
       int start = 0;
       int end = nums.length-1;
       int ans=0;

    if(nums.length==1){
        return nums[0];        
}
    
    while(start<=end){
        int mid = start + (end-start)/2;
        
        if( start<nums.length-1 && (nums[mid^0]==nums[mid^1] ) ){
            start = mid+1;
        }else{
            end = mid-1;
        }
    }
    return nums[start];
    }
}