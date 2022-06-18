class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
       char [] c=answerKey.toCharArray();
       int max1=countTorF(c,k,'T');
       int max2=countTorF(c,k,'F');
       return Math.max(max1,max2); 
    }
    int countTorF(char [] c, int k, char check){
        int count=0; int max=0; int j=-1;
        for(int i=0; i<c.length; i++){
            if(c[i]==check)count++;
            while(count>k){
                j++;
                if(c[j]==check)count--;
            }
            max=Math.max(max,i-j);
        }
        return max;
    }
    }