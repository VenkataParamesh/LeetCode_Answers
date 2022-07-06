class Solution {
    public String gcdOfStrings(String str1, String str2) {
	var m = str1.length();
	var n = str2.length();
	var gcdSize = findGCD(m, n);
	var gcd = str1.substring(0, gcdSize);
	
	return gcd.repeat(m / gcdSize).equals(str1) && 
		   gcd.repeat(n / gcdSize).equals(str2) 
		   ? gcd : "";
}

private int findGCD(int a, int b) {
	return a == 0 ? b : findGCD(b % a, a);
}
}