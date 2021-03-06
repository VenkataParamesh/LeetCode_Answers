class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstIndex = 0, lastIndex = numbers.length-1;
        while (firstIndex<lastIndex){
            int sum = numbers[firstIndex] + numbers[lastIndex];
            if (sum==target){
                return new int[]{firstIndex+1 , lastIndex+1};
            }else if (sum>target){
                lastIndex--;
            }else{
                firstIndex++;
            }
        }
        return new int[]{-1,-1}; 
    }
}