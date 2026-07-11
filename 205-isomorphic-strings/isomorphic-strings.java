class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> valueMap = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map.containsKey(a) && map.get(a) != b) {
                return false;
            }

            if(valueMap.containsKey(b) && valueMap.get(b)!= a){
                return false;
            }
            
            map.put(a,b);
            valueMap.put(b,a);
        }

        return true;
    }
}