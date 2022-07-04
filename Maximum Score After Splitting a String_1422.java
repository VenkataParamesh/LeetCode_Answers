class Solution {
    public int maxScore(String s) {
        int ones = 0;
	    int maxScore = Integer.MIN_VALUE;

	for (int i = 0, zeros = 0; i < s.length(); i++) {
		if (s.charAt(i) == '0')
			zeros++;
		else
			ones++;
		if (i < s.length() - 1) // since we want non-empty partitions
			maxScore = Math.max(maxScore, zeros - ones);
	}

	return maxScore + ones;
        
    }
}