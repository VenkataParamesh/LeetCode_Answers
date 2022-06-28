class Solution {
    public int maxNumberOfBalloons(String text) {
       
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'b' || ch == 'a' || ch == 'n')
                map.put(ch, map.getOrDefault(ch, 0) + 2);
            else if (ch == 'l' || ch == 'o') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println(map);

        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            min = Math.min(entry.getValue(), min);
        }

        return map.size() < 5 ? 0 : min / 2;
    }
}