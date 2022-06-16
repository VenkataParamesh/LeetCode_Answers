class Solution {
    public int specialArray(int[] nums) {
       Arrays.sort(nums);
        int len=nums.length;
        
        for(int i=0;i<=len;i++){
            int key=i;
            int count=len-binary(nums,key);
            if(count==i){
                return i;
            }
            
        }
        return -1;
        
    }
     public int binary(int[] arr,int key){
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]==key){
                result=mid;
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                result=mid;
                end=mid-1;
            }
        }
        return result;
    }
}