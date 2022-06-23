class Solution {
    public boolean squareIsWhite(String coordinates) {
      int x;
        char ch=coordinates.charAt(0);
     if(ch=='a')
         x=1;
    else if(ch=='b')
        x=2;
    else if(ch=='c')
        x=3;
    else if(ch=='d')
        x=4;
    else if(ch=='e')
        x=5;
    else if(ch=='f')
        x=6;
    else if(ch=='g')
        x=7;    
    else
        x=8;
    int y=Character.getNumericValue(coordinates.charAt(1));
    return ((x+y)%2==0)?false:true;
    }
}