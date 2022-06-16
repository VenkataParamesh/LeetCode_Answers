class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0, j = arr.length;
        
        while(i < j) {
            int m = i + (j - i) / 2;
            
            if(arr[m] - (m + 1) >= k)
                j = m;
            else
                i = m + 1;
        }
        return i + k;
    }
}