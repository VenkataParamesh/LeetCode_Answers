class Solution {
     public int shipWithinDays(int[] arr, int days) {
        int max=Integer.MIN_VALUE;
    int sum=0;
    for(int val:arr){
      sum+=val;
      max=Math.max(max,val);
    }
    if(days==arr.length) return max;
    int ans=0;
    int lo=max; int hi=sum;
    while(lo<=hi){
      int mid=lo+(hi-lo)/2;
      if(isPossible(arr,mid,days)){
       ans=mid;
       hi=mid-1;
      }
      else lo=mid+1;
    }

    return ans;
  }


    
    static boolean isPossible(int arr[],int maxLoad,int days){
    int tday=1;
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
      if(sum>maxLoad){
        tday++;
        sum=arr[i];
      }
    }

    return tday<=days;
  
  }
}