class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       int[] soldiers = new int[mat.length];

        // count number of soliders in each row by finding the ceiling of 1
        for (int i = 0; i < mat.length; i++) {
            soldiers[i] = ceil(mat[i]);
        }

        int[] weakOrder = new int[k];
        // based on minimum soldiers index fill the weakOrder array 
        for (int i = 0; i < k; i++) {
            int minIndex = min(soldiers);
            soldiers[minIndex] = -1;
            weakOrder[i] = minIndex;
        }

        return weakOrder;
    }
    
    public static int ceil(int[] row){
        int start = 0;
        int end = row.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(row[mid] < 1){
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }

        return start;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] < min){
                min = arr[i];
                index = i;
            }
        }

        return index;
    }
}