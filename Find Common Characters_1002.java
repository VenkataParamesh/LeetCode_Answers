class Solution {
    public List<String> commonChars(String[] words) {
          int i;
    Map<Character,Integer> map = new HashMap<>();
    for(i=0;i<words[0].length();i++){
        map.put(words[0].charAt(i),map.getOrDefault(words[0].charAt(i),0)+1);
    }

    for(i=1;i<words.length;i++){
        Map<Character,Integer> temp = new HashMap<>();
        for(int j=0;j<words[i].length();j++){
            char ch = words[i].charAt(j);
            if(map.containsKey(ch)){
                temp.put(ch,Math.min(map.get(ch),(temp.getOrDefault(ch,0)+1))); 
            }
        }
        map=temp; // now temp contains the union so update map to temp
    }
    
    List<String> ans = new ArrayList<>();
    for(Map.Entry<Character,Integer> entry: map.entrySet()){
        int temp = entry.getValue();
        while(temp>0){
        ans.add(String.valueOf(entry.getKey()));
        temp--;
        }
    }
    return ans; 
    }
}