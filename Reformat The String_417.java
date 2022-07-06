class Solution {
    public String reformat(String s) {
  int numOfDigits = 0, numOfLetters = 0, N = s.length();
    for (char ch : s.toCharArray()) {
      if (ch >= '0' && ch <= '9') ++numOfDigits;
      else ++numOfLetters;
    }
    //check if number of one is more than the others on more than 1 - reformatting is not possible 
    if (Math.abs(numOfDigits - numOfLetters) > 1) return "";

    int digitPos = 0, letterPos = 0;
    
    //find the first digit and letter
    while(digitPos < N && (s.charAt(digitPos) < '0' || s.charAt(digitPos) > '9'))
      ++digitPos;
    while(letterPos < N && (s.charAt(letterPos) < 'a' || s.charAt(letterPos) > 'z'))
      ++letterPos;
    //choose one to start from
    boolean digitCur = numOfDigits >= numOfLetters;
    StringBuilder sb = new StringBuilder();
    //while not all chars are processed
    while (sb.length() < N) {
      //if currently we are working with digits - add one and advance pointer
      if (digitCur) {
        sb.append(s.charAt(digitPos++));
        while(digitPos < N && (s.charAt(digitPos) < '0' || s.charAt(digitPos) > '9'))
          ++digitPos;
      } else {
        //otherwise add and advance pointer for letters
        sb.append(s.charAt(letterPos++));
        while(letterPos < N && (s.charAt(letterPos) < 'a' || s.charAt(letterPos) > 'z'))
          ++letterPos;
      }
      //flip flag so next iteration will take care of opposite type of char
      digitCur = !digitCur;
    }
    return sb.toString();
    }
}