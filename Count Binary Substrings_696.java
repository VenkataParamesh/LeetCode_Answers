class Solution {
    public int countBinarySubstrings(String s) {
        int zero = 0;
        int one = 0;
        int count = 0;
        int i = 0;
        for(i = 0 ; i < s.length() ; i++){
            if(i != 0 && s.charAt(i-1) == '1' && s.charAt(i) == '0'){
                count += Math.min(zero, one);
                zero = 0;
            }else if(i != 0 && s.charAt(i-1) == '0' && s.charAt(i) == '1'){
                count += Math.min(zero, one);
                one = 0;
            }
            if(s.charAt(i) == '0') zero++;
            else one++;
        }
        if(s.charAt(i-1) == '1'){
            count += Math.min(zero, one);
            zero = 0;
        }else if(s.charAt(i-1) == '0'){
            count += Math.min(zero, one);
            one = 0;
        }
        return count;
    }
}