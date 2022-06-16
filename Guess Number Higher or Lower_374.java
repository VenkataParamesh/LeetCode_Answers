public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start<=end){
            int num = guess(start + (end - start)/2);
            if(num==0){
                return start+ (end-start)/2;
            }
            else if(num<0){
                end = start + (end - start)/2 -1;
            }
            else{
                start = start + (end - start)/2 +1;
            }
        }
        return start;
        
    }
}